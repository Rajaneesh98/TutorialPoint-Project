package com.course.CourseService.service.impl;

import com.course.CourseService.entity.Course;
import com.course.CourseService.repository.CourseRepository;
import com.course.CourseService.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;
    private SequenceGeneratorService sequenceGeneratorService;

    @Override
    public Course save(Course course) {
        Integer sequence = sequenceGeneratorService.getNextSequence();
        course.setCourseId(sequence);
        return courseRepository.save(course);
    }
}
