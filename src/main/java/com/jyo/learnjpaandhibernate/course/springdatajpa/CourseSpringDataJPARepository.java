package com.jyo.learnjpaandhibernate.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jyo.learnjpaandhibernate.course.Course;

public interface CourseSpringDataJPARepository extends JpaRepository<Course, Long> {

}
