package com.example.lab_4.dao;

import com.example.lab_4.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentDAO {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);
}
