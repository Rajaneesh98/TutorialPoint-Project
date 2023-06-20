package com.course.CourseService.controller;

import com.course.CourseService.entity.Course;
import com.course.CourseService.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/course/addCourse")
    public ResponseEntity<Course> saveDepartment(@RequestBody Course course){
        Course savedCourse = courseService.save(course);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }

    @GetMapping("/course")
    public String testing(){
        return "Working....";
    }
}
