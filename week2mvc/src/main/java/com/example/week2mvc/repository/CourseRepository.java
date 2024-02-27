package com.example.week2mvc.repository;

import com.example.week2mvc.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>{
}
