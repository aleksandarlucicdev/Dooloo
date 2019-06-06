

package com.demo.spring.springsecurity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	
	public Course(){}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_course")
	private Long id_course;
	
	
	@Column(name="course_name")
	private String course_name;
	
	@Column(name="semester")
	private int semester;
	
	@Column(name="espb")
	private int espb;
	
	@Column(name="is_mandatory")
	private String is_mandatory;

	public Long getId_course() {
		return id_course;
	}

	public void setId_course(Long id_course) {
		this.id_course = id_course;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getEspb() {
		return espb;
	}

	public void setEspb(int espb) {
		this.espb = espb;
	}

	public String getIs_mandatory() {
		return is_mandatory;
	}

	public void setIs_mandatory(String is_mandatory) {
		this.is_mandatory = is_mandatory;
	}

	public Course(Long id_course, String course_name, int semester, int espb, String is_mandatory) {
		super();
		this.id_course = id_course;
		this.course_name = course_name;
		this.semester = semester;
		this.espb = espb;
		this.is_mandatory = is_mandatory;
	}
	
	
	
	
	
}

