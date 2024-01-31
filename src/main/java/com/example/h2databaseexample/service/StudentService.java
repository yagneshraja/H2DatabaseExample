package com.example.h2databaseexample.service;

import com.example.h2databaseexample.models.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> getAllStudents();
    Optional<Student> getStudent(Integer id);
    Student addStudent(Student student);

}
