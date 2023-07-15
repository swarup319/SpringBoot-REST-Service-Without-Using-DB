package com.springREST.SpringREST.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springREST.SpringREST.Entity.Course;

@Service
public class CourseServiceImpl implements CourseService{
	
	List<Course> list;


	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(120, "java", "Opbject oriented programming"));
		list.add(new Course(121, "php","programming language"));
		list.add(new Course(122,"c++","old programing language"));
		
	}


	@Override
	public List<Course> getCourses() {
		
		return list;
	}


	@Override
	public Course getCourse(Long courseId) {
		Course c = null;
		for(Course course:list) {
			if(course.getId()== courseId) {
				
				c= course;
				break;
			}
		}
		return c;
	}


	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}


	@Override
	public Course updateCourse(Course course) {
		list.forEach(e -> {
			if(e.getId()==course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});
		return course;
	}


	@Override
	public Course deleteCourse(Long courseId) {
		Course c=null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				list.remove(course);
				c= course;
				break;
			}
			
		}
		return c;
	}






}
