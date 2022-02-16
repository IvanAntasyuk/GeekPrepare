package com.antasyuk.spring.interfaces;

import com.antasyuk.spring.models.Student;

import java.util.List;
import java.util.Optional;

public interface StudentInterface extends DataBaseInterface {
    List<Student> getAllStudent();
    Optional<Student> findById(Long id);
    void save(Student student);
}