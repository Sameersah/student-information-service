package com.sameer.student_information_service.repository;

import com.sameer.student_information_service.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface StudentRepository  extends JpaRepository<Student, String> {
}
