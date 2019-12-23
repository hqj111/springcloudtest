package com.hqj.project.controller;

import com.hqj.project.entity.Student;
import com.hqj.project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author huangqingjia
 * @Create 2019-12-21 3:36
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public List<Student> getStuList(){
        List<Student> studentList = studentService.getStudentList();
        return studentList;
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public Student getStuById(@PathVariable int id){
        Student student = studentService.getStudentById(id);
        return student;
    }

    @RequestMapping(value = "/student/add", method = RequestMethod.POST)
    public boolean addStudent(@RequestBody Student student){

        return studentService.addStudent(student);
    }
}
