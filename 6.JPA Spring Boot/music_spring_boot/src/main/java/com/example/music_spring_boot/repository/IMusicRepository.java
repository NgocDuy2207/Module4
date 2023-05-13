package com.example.music_spring_boot.repository;

import com.example.music_spring_boot.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface IMusicRepository extends JpaRepository<Music, Integer> {

}
