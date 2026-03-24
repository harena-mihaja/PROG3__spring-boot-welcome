package edu.school.hei.prog3__springtd2.service;

import edu.school.hei.prog3__springtd2.entity.Student;
import edu.school.hei.prog3__springtd2.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> createStudents(List<Student> newStudentsList)
    {
        checkForValideStudents(newStudentsList);
        return (repository.saveStudents(newStudentsList));
    }

    private void checkForValideStudents(List<Student> studentList)
    {
        for (Student student : studentList)
        {
            if (student.getReference() == null || student.getReference().isBlank())
                throw new IllegalArgumentException("Student's reference can not be null");
            if (student.getFirstName() == null || student.getFirstName().isBlank())
                throw new IllegalArgumentException("Student's first name can not be null or blank");
            if (student.getLastName() == null || student.getLastName().isBlank())
                throw new IllegalArgumentException("Student's last name can not be null or blank");
            if (student.getAge() == null || student.getAge() == 0)
                throw new IllegalArgumentException("Student's age can not be null or 0");
        }
    }

    public List<Student> getAllStudents()
    {
        throw new UnsupportedOperationException("Not implemented");
    }
}
