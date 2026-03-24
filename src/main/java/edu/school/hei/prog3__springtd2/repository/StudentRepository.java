package edu.school.hei.prog3__springtd2.repository;

import edu.school.hei.prog3__springtd2.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {
    private final List<Student> studentList;

    public StudentRepository(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> saveStudents(List<Student> newStudentsList) {
        studentList.addAll(newStudentsList);
        return (newStudentsList);
    }

    public List<Student> findAllStudents()
    {
        return (studentList);
    }
}
