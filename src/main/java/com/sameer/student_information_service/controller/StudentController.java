package com.sameer.student_information_service.controller;

import com.sameer.student_information_service.dto.StudentDTO;
import com.sameer.student_information_service.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/create/{studentId}")
    public StudentDTO createStudent( @RequestBody StudentDTO studentDTO, @PathVariable int studentId) {
        return studentService.createStudent(studentDTO,studentId);
    }

    @GetMapping("/get/{studentId}")
    public StudentDTO getStudent(@PathVariable int studentId) {
        return studentService.getStudentById(studentId);
    }


}
