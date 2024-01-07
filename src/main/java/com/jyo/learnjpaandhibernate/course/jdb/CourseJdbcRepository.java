package com.jyo.learnjpaandhibernate.course.jdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jyo.learnjpaandhibernate.course.Course;

@Repository
public class CourseJdbcRepository {
	@Autowired
	private JdbcTemplate springJdbcTemplate;

	private static String INSERT_QUERY = """
			insert into course(id, name, author) values(?, ?, ?);
			""";
	private static String DELETE_QUERY = """
			delete from course where id = ?;
			""";

	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}
	
	public void deleteById(long id) {
		springJdbcTemplate.update(DELETE_QUERY, id);
	}
}
