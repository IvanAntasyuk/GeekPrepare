package com.antasyuk.spring.repository;

import com.antasyuk.spring.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Long> {
}