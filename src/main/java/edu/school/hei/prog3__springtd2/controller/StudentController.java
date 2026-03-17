package edu.school.hei.prog3__springtd2.controller;

import edu.school.hei.prog3__springtd2.entity.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @PostMapping("/students")
    public List<Student> createStudents(@RequestBody List<Student> newStudents)
    {
        throw new UnsupportedOperationException("Not implemented");
    }
}
