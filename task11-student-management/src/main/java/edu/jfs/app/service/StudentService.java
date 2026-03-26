package edu.jfs.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jfs.app.entity.Student;
import edu.jfs.app.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    StudentRepository repo;

    public List<Student> getStudents() {
        return repo.findAll();
    }

    public Student getStudent(int id) {
        return repo.findById(id).orElse(null);
    }

    public Student getStudentByName(String name) {
        return repo.findByName(name);
    }

    public void addStudent(Student student) {
        repo.save(student);
    }
}