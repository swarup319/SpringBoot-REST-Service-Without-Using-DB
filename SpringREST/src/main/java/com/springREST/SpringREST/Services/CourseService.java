 package com.springREST.SpringREST.Services;

import java.util.List;

import com.springREST.SpringREST.Entity.Course;

public interface CourseService {
	public List<Course> getCourses();
	
	public Course getCourse(Long courseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public Course deleteCourse(Long courseId);

}


