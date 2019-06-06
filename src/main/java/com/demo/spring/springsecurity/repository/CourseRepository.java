


package com.demo.spring.springsecurity.repository;



import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.spring.springsecurity.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

 Optional<Course> findById(Long id_course);

}

