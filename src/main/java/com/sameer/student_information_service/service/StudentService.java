package com.sameer.student_information_service.service;

import com.sameer.student_information_service.dto.StudentDTO;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

    public StudentDTO createStudent(StudentDTO studentDTO, int studentId);

    public StudentDTO getStudentById(int studentId);

}
