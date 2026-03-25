package edu.school.hei.prog3__springtd2.service;

import edu.school.hei.prog3__springtd2.entity.Student;
import edu.school.hei.prog3__springtd2.repository.StudentRepository;
import edu.school.hei.prog3__springtd2.validator.StudentValidator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;
    private final StudentValidator validator;

    public StudentService(StudentRepository repository, StudentValidator validator) {
        this.repository = repository;
        this.validator = validator;
    }

    public List<Student> createStudents(List<Student> newStudentsList)
    {
        for (Student student : newStudentsList)
        {
            validator.validate(student);
        }
        return (repository.saveStudents(newStudentsList));
    }

     public List<Student> getAllStudents()
    {
        return (repository.findAllStudents());
    }
}
