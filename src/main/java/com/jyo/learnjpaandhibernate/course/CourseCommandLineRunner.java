package com.jyo.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jyo.learnjpaandhibernate.course.jdb.CourseJdbcRepository;
import com.jyo.learnjpaandhibernate.course.jpa.CourseJPARepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	/*
	 * @Autowired private CourseJdbcRepository repository;
	 */
	@Autowired
	private CourseJPARepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1, "Learn JAVA JPA", "jyothish"));
		repository.insert(new Course(2, "Learn Azure JPA", "Manu"));
		repository.insert(new Course(3, "Learn Cloud JPA", "vishnu"));
		
		repository.deleteById(3);
		
		System.out.println(repository.findById(2));
	}

}
