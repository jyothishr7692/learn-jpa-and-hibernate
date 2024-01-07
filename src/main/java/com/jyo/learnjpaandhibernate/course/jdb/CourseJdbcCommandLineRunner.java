package com.jyo.learnjpaandhibernate.course.jdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jyo.learnjpaandhibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
	@Autowired
	private CourseJdbcRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1, "Learn JAVA", "jyothish"));
		repository.insert(new Course(2, "Learn Azure", "Manu"));
		repository.insert(new Course(3, "Learn Cloud", "vishnu"));
		
		repository.deleteById(3);
		
		System.out.println(repository.findById(2));
	}

}
