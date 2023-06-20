package com.course.CourseService.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Course {

    @Id
    String CourseId;
    String courseName;
    Integer fees;
    Integer duration;
    String courseType;
    Float rating;
}
