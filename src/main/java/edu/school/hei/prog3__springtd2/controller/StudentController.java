package edu.school.hei.prog3__springtd2.controller;

import edu.school.hei.prog3__springtd2.entity.Student;
import edu.school.hei.prog3__springtd2.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping("/students")
    public List<Student> createStudents(@RequestBody List<Student> newStudentsList)
    {
        return (service.createStudents(newStudentsList));
    }
}
