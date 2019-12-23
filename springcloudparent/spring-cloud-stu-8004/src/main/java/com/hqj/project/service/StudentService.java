package com.hqj.project.service;



import com.hqj.project.entity.Student;

import java.util.List;

/**
 * @Author huangqingjia
 * @Create 2019-12-20 20:51
 */
public interface StudentService {
    List<Student> getStudentList();
    Student getStudentById(int id);
    Boolean addStudent(Student student);
}
