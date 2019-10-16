package com.maven.advance.service.impl;

import com.maven.advance.dao.IStudentMapper;
import com.maven.advance.domain.Student;
import com.maven.advance.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private IStudentMapper studentMapper;
    @Override
    public List<Student> findAllStudent() {
        return studentMapper.findAllStudent();
    }
}
