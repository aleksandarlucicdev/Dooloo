package com.demo.spring.springsecurity.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.springsecurity.model.Course;
import com.demo.spring.springsecurity.service.CourseService;

@RestController
public class CourseController {

	Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired private CourseService courseService;
	
	@GetMapping(value="/courses")
	public ResponseEntity<List<Course>> getAllcourses(){
		log.info("User is trying to enter /courses endpoint");
		
		List<Course> courses = courseService.findAll();
		return new ResponseEntity<List<Course>>(courses, HttpStatus.OK);
}
	
@GetMapping(value="/getcourse")
	
	public ResponseEntity<Course> getCourse(Long id_course){
		Course course = courseService.getCourseById(id_course);
		return new ResponseEntity<Course>(course, HttpStatus.OK);
}


@PostMapping(path = "/courses")
Course addCourse(@RequestBody Course course) {
    return courseService.save(course);
}


@DeleteMapping(path="/{id_course}")
public  ResponseEntity<Void> deleteCourse(@PathVariable(value ="id_course") Long id_course) {
	courseService.deleteById(id_course);
	return ResponseEntity.noContent().build();	
}


@PutMapping("courses")
public ResponseEntity<Course> updateCourse(@RequestBody Course course){
	
	courseService.updateCourse(course);
	return new	ResponseEntity<Course>(HttpStatus.OK);
}

	
}
