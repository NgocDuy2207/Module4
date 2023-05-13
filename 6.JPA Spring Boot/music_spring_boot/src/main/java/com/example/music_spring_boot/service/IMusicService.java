package com.example.music_spring_boot.service;

import com.example.music_spring_boot.dto.MusicCreateDTO;
import com.example.music_spring_boot.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> getAll();

    void save(Music music);

    Music findById(int id);

    void update(int id, Music music);

    void remove(int id);

}
