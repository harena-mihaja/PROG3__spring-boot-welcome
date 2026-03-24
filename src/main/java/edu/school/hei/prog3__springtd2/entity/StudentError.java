package edu.school.hei.prog3__springtd2.entity;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentError {
    private Integer statusCode;
    private String message;
}
