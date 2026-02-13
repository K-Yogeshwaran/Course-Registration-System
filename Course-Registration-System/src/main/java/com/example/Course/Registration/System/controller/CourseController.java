package com.example.Course.Registration.System.controller;


import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500/")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/getAvailableCourses")
    public List<Course> getAvailableCourses(){
        return courseService.getAvailableCourses();
    }

    @PostMapping("/addCourse")
    public String addCourse(
            @RequestParam("courseId") String courseId, @RequestParam("courseName") String courseName,
            @RequestParam("trainer") String trainer, @RequestParam("durationInWeeks") int durationInWeeks){
        courseService.addCourse(courseId, courseName, trainer, durationInWeeks);
        return "Course "+courseName+" added Successfully";
    }

    @GetMapping("/getEnrolledStudents")
    public List<CourseRegistry> getEnrolledStudents(){
        return courseService.getEnrolledStudents();
    }

    @PostMapping("/enrollCourse")
    public String enrollCourse(
            @RequestParam("courseName") String courseName, @RequestParam("name") String name,
            @RequestParam("emailId") String emailId ){
        courseService.enrollCourse(courseName, name, emailId);
        return "Student "+name+" enrolled in "+courseName+" successfully";
    }

}
