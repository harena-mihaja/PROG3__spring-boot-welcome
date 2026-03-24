package edu.school.hei.prog3__springtd2.controller;

import edu.school.hei.prog3__springtd2.entity.Student;
import edu.school.hei.prog3__springtd2.entity.StudentError;
import edu.school.hei.prog3__springtd2.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> createStudents(@RequestBody List<Student> newStudentsList)
    {
        try{
            return (ResponseEntity.status(HttpStatus.CREATED)
                    .body(service.createStudents(newStudentsList)));
        } catch (RuntimeException e) {
            return (ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(StudentError.builder()
                            .statusCode(500)
                            .message(e.getMessage())
                            .build()));
        }
    }
}
