package com.jyo.learnjpaandhibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.jyo.learnjpaandhibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJPARepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(long id) {
		return entityManager.find(Course.class, id);
	}
	
	public void deleteById(long id)  {
		Course course = entityManager.find(Course.class, id);
		 entityManager.remove(course);
	}
}
