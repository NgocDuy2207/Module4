package com.example.hom_thu_dien_tu.repository;

import com.example.hom_thu_dien_tu.model.Email;

import java.util.ArrayList;
import java.util.List;

public class EmailRepository {
   static List<Email> emailList = new ArrayList<>();
    static {
        emailList.add(new Email("English",25, true, "nguyen Duy"));
        emailList.add(new Email("Vietnamese",50, false, "nguyen hung"));
        emailList.add(new Email("Japanese",100, true, "nguyen Dung"));
        emailList.add(new Email("Chinese",14, false, "nguyen Dung"));
    }
    public static List<Email> findAll(){
        return emailList;
    }
    public static void add(Email email){
        emailList.add(email);
    }
}
