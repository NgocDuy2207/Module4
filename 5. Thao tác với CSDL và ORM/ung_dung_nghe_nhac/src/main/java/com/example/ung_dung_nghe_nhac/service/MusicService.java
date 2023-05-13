package com.example.ung_dung_nghe_nhac.service;
import com.example.ung_dung_nghe_nhac.model.Music;
import com.example.ung_dung_nghe_nhac.repository.RepositoryMusic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.persistence.EntityTransaction;
import java.util.List;


@Service
public class MusicService implements IMusicService{
    @Autowired
    private RepositoryMusic repository;
    @Override
    public List<Music> findAll() {
        List<Music> musicList = repository.entityManager.createQuery("select s from Music s", Music.class).getResultList();

        return musicList;
    }

    @Override
    public void save(Music music) {
        EntityTransaction entityTransaction = repository.entityManager.getTransaction();
        entityTransaction.begin();
        repository.entityManager.persist(music);
        entityTransaction.commit();
    }
    @Override
    public Music findById(int id) {
        Music music = repository.entityManager.find(Music.class, id);
        return music;
    }
    @Override
    public void update(int id, Music music) {
        Music existingMusic = repository.entityManager.find(Music.class, id);
        if(existingMusic != null) {
            EntityTransaction entityTransaction = repository.entityManager.getTransaction();
            entityTransaction.begin();
            existingMusic.setName(music.getName());
            existingMusic.setArtistName(music.getArtistName());
            existingMusic.setKindOfMusic(music.getKindOfMusic());
            existingMusic.setPathMusic(music.getPathMusic());
            repository.entityManager.persist(existingMusic);
            entityTransaction.commit();
        }

    }
    @Override
    public void remove(int id) {
        Music musicRemove = findById(id);
        EntityTransaction entityTransaction = repository.entityManager.getTransaction();
        entityTransaction.begin();
        repository.entityManager.remove(musicRemove);
        entityTransaction.commit();
    }
}
