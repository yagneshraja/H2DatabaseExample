package com.example.h2databaseexample.controller;

import com.example.h2databaseexample.models.Student;
import com.example.h2databaseexample.service.SelfStudentService;
import com.example.h2databaseexample.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {
    private StudentService studentService;

    public StudentController(SelfStudentService selfStudentService){
        this.studentService = selfStudentService;
    }

    @GetMapping("")
    public List<Student> getAllStudents(){
        return this.studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudent(@PathVariable("id") Integer id){
        return  this.studentService.getStudent(id);
    }

    @PostMapping()
    public Student addStudent(@RequestBody Student student){
        return this.studentService.addStudent(student);
    }

}
