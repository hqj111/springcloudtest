package com.hqj.project.controller;

import com.hqj.project.entity.Student;
import com.hqj.project.service.StudentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author huangqingjia
 * @Create 2019-12-23 2:06
 */
@RestController
public class FeignController {

    @Autowired
    private StudentFeignService studentFeignService;

    @RequestMapping("/eureka/feign/student/add")
    public boolean addStudent(Student student) {
        return studentFeignService.addStudent(student);
    }

    @RequestMapping(value = "/eureka/feign/student")
    public List<Student> getStuList() {
        return studentFeignService.getStuList();
    }

    @RequestMapping(value = "/eureka/feign/student/{id}")
    public Student getStuById(@PathVariable("id") int id) {
        return studentFeignService.getStuById(id);
    }
}
