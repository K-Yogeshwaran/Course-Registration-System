package com.example.Course.Registration.System.service;


import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.repository.CourseRegistryRepository;
import com.example.Course.Registration.System.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CourseRegistryRepository courseRegistryRepository;

    public List<Course> getAvailableCourses(){
        return courseRepository.findAll();
    }

    public void addCourse(String courseId, String courseName, String trainer, int durationInWeeks){
        courseRepository.save(new Course(courseId, courseName, trainer, durationInWeeks));
    }

    public List<CourseRegistry> getEnrolledStudents(){
        return courseRegistryRepository.findAll();
    }

    public void enrollCourse(String courseName, String name, String emailId){
        courseRegistryRepository.save(new CourseRegistry(courseName, name, emailId));
    }
}
