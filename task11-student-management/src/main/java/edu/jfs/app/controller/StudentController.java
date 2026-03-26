package edu.jfs.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import edu.jfs.app.entity.Student;
import edu.jfs.app.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/getStudents")
    public List<Student> getStudents() {
        return service.getStudents();
    }

    @GetMapping("/getStudent/{id}")
    public Student getStudent(@PathVariable int id) {
        return service.getStudent(id);
    }

    @GetMapping("/getStudentByName/{name}")
    public Student getStudentByName(@PathVariable String name) {
        return service.getStudentByName(name);
    }

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        service.addStudent(student);
        return student;
    }
}