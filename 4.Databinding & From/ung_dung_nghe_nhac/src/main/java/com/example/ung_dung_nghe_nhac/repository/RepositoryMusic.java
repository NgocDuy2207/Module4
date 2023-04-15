package com.example.ung_dung_nghe_nhac.repository;

import com.example.ung_dung_nghe_nhac.model.Music;

import java.util.ArrayList;
import java.util.List;

public class RepositoryMusic {
    static List<Music> emailList = new ArrayList<>();
    static {
        emailList.add(new Music("tôi yêu em","Ngọc Mai", "trữ tình", "toiyeuem.org"));

    }
    public static List<Music> findAll(){
        return emailList;
    }
    public static void add(Music music){
        emailList.add(music);
    }
}
