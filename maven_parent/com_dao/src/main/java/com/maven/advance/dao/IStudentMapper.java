package com.maven.advance.dao;

import com.maven.advance.domain.Student;

import java.util.List;

public interface IStudentMapper {
    List<Student> findAllStudent();
}
