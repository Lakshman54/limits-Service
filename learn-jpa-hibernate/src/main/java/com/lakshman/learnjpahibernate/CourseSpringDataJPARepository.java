package com.lakshman.learnjpahibernate;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJPARepository  extends JpaRepository<Course,Long> {
    List<Course> findByAuthor(String author);
}
