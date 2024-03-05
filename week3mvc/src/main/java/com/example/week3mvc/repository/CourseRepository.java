package com.example.week3mvc.repository;

import com.example.week3mvc.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>{
}
