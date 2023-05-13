package com.example.music_spring_boot.service;
import com.example.music_spring_boot.model.Music;
import com.example.music_spring_boot.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MusicService implements IMusicService{
    @Autowired
    private IMusicRepository repository;

    @Override
    public List<Music> getAll() {
        return repository.findAll();
    }

    @Override
    public void save(Music music) {
        this.repository.save(music);
    }

    @Override
    public Music findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void update(int id, Music music) {
        this.repository.save(music);
    }

    @Override
    public void remove(int id) {
        Music music = findById(id);
        this.repository.delete(music);
    }
}
