package com.course.CourseService.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;


@Data                                    //includes setter and getter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Course {

    @Id
    private Integer courseId;
    private String courseName;
    private Integer fees;
    private Integer duration;
    private String courseType;
    private Float rating;
}
