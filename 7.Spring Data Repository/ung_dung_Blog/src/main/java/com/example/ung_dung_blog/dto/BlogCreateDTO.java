package com.example.ung_dung_blog.dto;

import com.example.ung_dung_blog.model.Category;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class BlogCreateDTO implements Validator {



    private String title;


    private String content;


    private String namePeoplePost;

    private Date dayWriteBlog;

    private Category category;
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
