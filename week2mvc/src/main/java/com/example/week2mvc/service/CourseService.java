package com.example.week2mvc.service;

import com.example.week2mvc.entity.Course;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();
    void saveCourse(Course course);
    Course getCourseById(long id);
    void deleteCourseById(long id);
    Page<Course> findPaginated(int pageNum, int pageSize,
                               String sortField,
                               String sortDirection);
}
