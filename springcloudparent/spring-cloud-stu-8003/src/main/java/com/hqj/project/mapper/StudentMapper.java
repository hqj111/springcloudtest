package com.hqj.project.mapper;

import com.hqj.project.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author huangqingjia
 * @Create 2019-12-20 20:35
 */
@Mapper
public interface StudentMapper {
    List<Student> getStudentList();
    Student getStudentById(int id);
    Boolean addStudent(Student student);
}
