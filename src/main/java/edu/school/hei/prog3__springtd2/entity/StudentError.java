package edu.school.hei.prog3__springtd2.entity;

import lombok.*;

@Data
@Builder
public class StudentError {
    private Integer statusCode;
    private String message;
}
