package com.course.CourseService.CourseServicePakg.impl;

import com.course.CourseService.entity.Course;
import com.course.CourseService.repository.CourseRepository;
import com.course.CourseService.CourseServicePakg.CourseServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseServiceInterface {

    private CourseRepository courseRepository;

    @Override
    public Course save(Course course) {
       Course savedCourse = courseRepository.save(course);
       return savedCourse;
    }
}
