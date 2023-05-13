package com.example.ung_dung_blog.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title_blog", columnDefinition = "varchar(50)")
    private String title;

    @Column(name = "content_blog", columnDefinition = "longtext")
    private String content;

    @Column(name = "namePeople_blog", columnDefinition = "varchar(50)")
    private String namePeoplePost;
    @Column(name = "day_write_blog", columnDefinition = "date", nullable = false)
    private Date dayWriteBlog;
    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

//    public Blog() {
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public String getNamePeoplePost() {
//        return namePeoplePost;
//    }
//
//    public void setNamePeoplePost(String namePeoplePost) {
//        this.namePeoplePost = namePeoplePost;
//    }
//
//    public Date getDayWriteBlog() {
//        return dayWriteBlog;
//    }
//
//    public void setDayWriteBlog(Date dayWriteBlog) {
//        this.dayWriteBlog = dayWriteBlog;
//    }
//
//    public Category getCategory() {
//        return category;
//    }
//
//    public void setCategory(Category category) {
//        this.category = category;
//    }
}
