package com.example.music_spring_boot.model;


import javax.persistence.*;

@Entity
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", columnDefinition = "varchar(50)")
    private String name;
    @Column(name = "artist_name", columnDefinition = "varchar(50)")
    private String artistName;
    @Column(name = "kind_of_music", columnDefinition = "varchar(50)")
    private String kindOfMusic;
    @Column(name = "path_music", columnDefinition = "longtext")
    private String pathMusic;

    public Music(){

    }

    public Music(Integer id, String name, String artistName, String kindOfMusic, String pathMusic) {
        this.id = id;
        this.name = name;
        this.artistName = artistName;
        this.kindOfMusic = kindOfMusic;
        this.pathMusic = pathMusic;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
