package edu.school.hei.prog3__springtd2.controller;

import edu.school.hei.prog3__springtd2.entity.Student;
import edu.school.hei.prog3__springtd2.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping("/students")
    public List<String> createStudents(@RequestBody List<Student> newStudentsList)
    {
        return (service.createStudents(newStudentsList));
    }

    @GetMapping("/students")
    public String getAllStudentsName(@RequestHeader("Accept") String format)
    {
        if (format.toLowerCase().contains("text/plain"))
            return (service.getAllStudentsName());
        else
            return ("Format not supported");
    }

}
