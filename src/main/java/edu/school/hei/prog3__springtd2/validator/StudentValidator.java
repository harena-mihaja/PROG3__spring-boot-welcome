package edu.school.hei.prog3__springtd2.validator;

import edu.school.hei.prog3__springtd2.entity.Student;
import edu.school.hei.prog3__springtd2.exception.BadRequestException;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class StudentValidator {
    public void validate(Student student)
    {
        if (student.getReference() == null || student.getReference().isBlank())
            throw new BadRequestException("Student's reference can not be null or blank");
        if (student.getFirstName() == null || student.getFirstName().isBlank())
            throw new BadRequestException("Student's first name can not be null or blank");
        if (student.getLastName() == null || student.getLastName().isBlank())
            throw new BadRequestException("Student's last name can not be null or blank");
    }
}
