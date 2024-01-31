package com.example.h2databaseexample.service;

import com.example.h2databaseexample.models.Student;
import com.example.h2databaseexample.repsoitory.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SelfStudentService implements StudentService{

    private StudentRepo studentRepo;

    public SelfStudentService(StudentRepo studentRepo){
        this.studentRepo = studentRepo;
    }

    @Override
    public List<Student> getAllStudents() {
        return this.studentRepo.findAll();
    }

    @Override
    public Optional<Student> getStudent(Integer id) {
        return this.studentRepo.findById(id);
    }

    @Override
    public Student addStudent(Student student) {
        return this.studentRepo.save(student);
    }
}
