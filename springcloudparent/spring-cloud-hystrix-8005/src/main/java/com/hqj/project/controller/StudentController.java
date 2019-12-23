package com.hqj.project.controller;

import com.hqj.project.entity.Student;
import com.hqj.project.service.StudentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    public List<Student> getStuList() {
        List<Student> studentList = studentService.getStudentList();
        return studentList;
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "getStuByIdHystrix")
    public Student getStuById(@PathVariable int id) throws InterruptedException {
        if(id == 999){
            throw new RuntimeException();
        }
        if(id == 555){
            Thread.sleep(5000);
        }
        return studentService.getStudentById(id);
    }

    //熔断后使用的方法
    public Student getStuByIdHystrix(@PathVariable int id) {
        return new Student(id, "找不到有效名字", null, "找不到有效性别", "找不到有效数据库");
    }

    @RequestMapping(value = "/student/add", method = RequestMethod.POST)
    public boolean addStudent(@RequestBody Student student) {

        return studentService.addStudent(student);
    }
}
