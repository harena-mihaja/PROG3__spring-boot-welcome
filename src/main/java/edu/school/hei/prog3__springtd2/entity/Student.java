package edu.school.hei.prog3__springtd2.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
public class Student {
    private String reference;
    private String fristName;
    private String lastName;
    private Integer age;
}
