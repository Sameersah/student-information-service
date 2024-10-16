package com.sameer.student_information_service.service.impl;

import com.sameer.student_information_service.dto.StudentDTO;
import com.sameer.student_information_service.model.Student;
import com.sameer.student_information_service.repository.StudentRepository;
import com.sameer.student_information_service.service.StudentService;
import org.modelmapper.ModelMapper;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service

public class StudentServiceImpl implements StudentService {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(StudentServiceImpl.class);

    @Autowired
    StudentRepository repository;

    @Override
    public StudentDTO createStudent(StudentDTO studentDTO, int studentId) {
        log.info("Creating student");
        log.info("Student Name: {}", studentDTO.getName());
        log.info("Student created successfully");
        ModelMapper modelMapper = new ModelMapper();
        Student student =modelMapper.map(studentDTO, Student.class);
        student.setId(studentId);
        repository.save(student);
        return studentDTO;
    }

    @Override
    public StudentDTO getStudentById(int studentId) {
       log.info("Retrieving student");
        log.info("Student Id: {}", studentId);
      Student student =  repository.getReferenceById(String.valueOf(studentId));
      ModelMapper mapper = new ModelMapper();
        return mapper.map(student, StudentDTO.class);
    }


}
