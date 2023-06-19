package com.example.exam.repository;

import com.example.exam.model.Score;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ScoreRepository extends JpaRepository<Score, Integer> {
//    @Query(value = "SELECT * FROM score u WHERE u.status = :status and u.name = :name", nativeQuery = true)

    Page<Score> findAllByStudent_NameLike(Pageable pageable, String name);
}
