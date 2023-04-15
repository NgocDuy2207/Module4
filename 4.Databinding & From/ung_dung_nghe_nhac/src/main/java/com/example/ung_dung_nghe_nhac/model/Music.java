package com.example.ung_dung_nghe_nhac.model;

public class Music {
    private String name;
    private String artistName;
    private String kindOfMusic;
    private String pathMusic;

    public Music(){

    }

    public Music(String name, String artistName, String kindOfMusic, String pathMusic) {
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
}
