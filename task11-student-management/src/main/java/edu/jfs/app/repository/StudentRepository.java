package edu.jfs.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.jfs.app.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student findByName(String name);

}