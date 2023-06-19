package com.example.ung_dung_blog.repository;

import com.example.ung_dung_blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;

import javax.transaction.Transactional;


@Transactional
public interface IBlogRepository extends JpaRepository<Blog, Integer> {

    @Query("select e from Blog e order by e.dayWriteBlog desc ")
    Page<Blog> findAllSortDay(Pageable pageable);


}
