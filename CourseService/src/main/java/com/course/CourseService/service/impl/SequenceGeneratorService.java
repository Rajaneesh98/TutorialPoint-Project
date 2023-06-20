package com.course.CourseService.service.impl;

import com.course.CourseService.entity.DbSequence;
import com.course.CourseService.repository.SequenceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SequenceGeneratorService {

    private SequenceRepository sequenceRepository;

    public int getNextSequence() {
        String sequenceName = "course_sequence";
        DbSequence dbSequence = sequenceRepository.findById(sequenceName)
                .orElseGet(() -> {
                    DbSequence newDbSequence = new DbSequence();
                    newDbSequence.setId(sequenceName);
                    newDbSequence.setSeq(200);
                    return newDbSequence;
                });

        Integer nextSeq = dbSequence.getSeq();
        dbSequence.setSeq(nextSeq + 1);
        sequenceRepository.save(dbSequence);
        return nextSeq;
    }

}
