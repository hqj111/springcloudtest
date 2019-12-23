package com.hqj.project.service.impl;


import com.hqj.project.entity.Student;
import com.hqj.project.mapper.StudentMapper;
import com.hqj.project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author huangqingjia
 * @Create 2019-12-20 20:52
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getStudentList() {
        return studentMapper.getStudentList();
    }

    @Override
    public Student getStudentById(int id) {
        return studentMapper.getStudentById(id);
    }

    @Override
    public Boolean addStudent(Student student) {
        return studentMapper.addStudent(student);
    }
}
