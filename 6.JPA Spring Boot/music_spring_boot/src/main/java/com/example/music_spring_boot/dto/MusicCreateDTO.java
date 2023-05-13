package com.example.music_spring_boot.dto;

import org.hibernate.validator.constraints.Length;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class MusicCreateDTO implements Validator {


    @NotBlank(message = "Name not blank")
    @Length(max = 800, message = "not more than 800 words")
    @Pattern(regexp = "[a-zA-Z][a-zA-Z ]+")
    private String name;
    @NotBlank(message = "ArtistName not blank")
    @Length(max = 300, message = "not more than 800 words")
    @Pattern(regexp = "[a-zA-Z][a-zA-Z ]+")
    private String artistName;
    @NotBlank(message = "KindOfMusic not blank")
    @Length(max = 1000, message = "not more than 1000 words")
    @Pattern(regexp = "[a-zA-Z][a-zA-Z ]+")
    private String kindOfMusic;
    @NotBlank(message = "pathMusic not blank")
    private String pathMusic;

    public MusicCreateDTO() {
    }

    public MusicCreateDTO(String name, String artistName, String kindOfMusic, String pathMusic) {
        this.name = name;
        this.artistName = artistName;
        this.kindOfMusic = kindOfMusic;
        this.pathMusic = pathMusic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }

    public String getPathMusic() {
        return pathMusic;
    }

    public void setPathMusic(String pathMusic) {
        this.pathMusic = pathMusic;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
