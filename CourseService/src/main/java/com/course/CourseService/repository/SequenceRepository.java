package com.course.CourseService.repository;

import com.course.CourseService.entity.DbSequence;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SequenceRepository extends MongoRepository<DbSequence, String> {
}
