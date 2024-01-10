package com.jyo.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jyo.learnjpaandhibernate.course.jdb.CourseJdbcRepository;
import com.jyo.learnjpaandhibernate.course.jpa.CourseJPARepository;
import com.jyo.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJPARepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	/*
	 * @Autowired private CourseJdbcRepository repository;
	 */
	/*
	 * @Autowired private CourseJPARepository repository;
	 */
	@Autowired
	private CourseSpringDataJPARepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(1, "Learn JAVA JPA", "jyothish"));
		repository.save(new Course(2, "Learn Azure JPA", "Manu"));
		repository.save(new Course(3, "Learn Cloud JPA", "vishnu"));
		
		repository.deleteById(3l);
		
		System.out.println(repository.findById(1l));
		System.out.println(repository.findById(2l));
		
		System.out.println(repository.findAll());	
		System.out.println(repository.count());
		System.out.println(repository.findByAuthor("jyothish"));
		System.out.println(repository.findByName("Learn Azure JPA"));
	}
	
}
