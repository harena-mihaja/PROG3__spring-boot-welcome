package edu.school.hei.prog3__springtd2.controller;

import edu.school.hei.prog3__springtd2.entity.Student;
import edu.school.hei.prog3__springtd2.error.StudentError;
import edu.school.hei.prog3__springtd2.exception.BadRequestException;
import edu.school.hei.prog3__springtd2.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        } catch (BadRequestException e) {
            return (ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(StudentError.builder()
                            .code(400)
                            .message(e.getMessage())
                            .build()));
        }
    }
    @GetMapping("/students")
    public ResponseEntity<?> getAllStudents(@RequestHeader(name = "Accept", required = false) String accept)
    {
        if (accept == null)
            return (ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(StudentError.builder()
                            .code(400)
                            .message("Accept header can not be null")));
        if (!accept.equalsIgnoreCase("application/json"))
            return (ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED)
                    .body(StudentError.builder()
                            .code(501)
                            .message("Format not supported")));
        return (ResponseEntity.status(HttpStatus.OK)
                    .body(service.getAllStudents()));

    }
}
