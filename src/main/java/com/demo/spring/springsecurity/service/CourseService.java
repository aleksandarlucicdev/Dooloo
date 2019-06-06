package com.demo.spring.springsecurity.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.demo.spring.springsecurity.model.Course;

@Service
public interface CourseService {
	
	Course save (Course course);
	
	Course getCourseById(Long id_course);

	List<Course> findAll();

	void deleteById(Long id_course);

	void updateCourse(Course course);

}






