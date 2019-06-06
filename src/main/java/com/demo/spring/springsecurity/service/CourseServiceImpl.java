package com.demo.spring.springsecurity.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.spring.springsecurity.model.Course;
import com.demo.spring.springsecurity.repository.CourseRepository;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {


@Autowired CourseRepository courseRepository;

@Override
public Course save(Course course) {
	return courseRepository.save(course);
}

@Override
public Course getCourseById(Long id_course) {
	return courseRepository.findById(id_course).get();

}

@Override
public List<Course> findAll() {
	return (List<Course>)courseRepository.findAll();

}

@Override
public void deleteById(Long id_course) {
	courseRepository.deleteById(id_course);
	
}

@Override
public void updateCourse(Course course) {
	courseRepository.save(course);
	
}
 


}


