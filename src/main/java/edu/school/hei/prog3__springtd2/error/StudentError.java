package edu.school.hei.prog3__springtd2.error;

import lombok.*;

@Data
@Builder
public class StudentError {
    private Integer code;
    private String message;
}
