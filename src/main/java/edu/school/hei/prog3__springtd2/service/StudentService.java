package edu.school.hei.prog3__springtd2.service;

import edu.school.hei.prog3__springtd2.entity.Student;
import edu.school.hei.prog3__springtd2.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<String> createStudents(List<Student> newStudentsList)
    {
        return (repository.saveStudents(newStudentsList)
                .stream()
                .map(Student::getFirstName)
                .toList());
    }

    public String getAllStudentsName()
    {
        return (repository.findAllStudents().stream()
                .map(Student::getFirstName)
                .collect(Collectors.joining(", ")));
    }
}
