package com.hqj.project.controller;

import com.hqj.project.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author huangqingjia
 * @Create 2019-12-22 19:31
 */
@RestController
public class StudentContrller {


//    public static final String REST_URL_PREFIX = "http://localhost:8001";
    public static final String REST_URL_PREFIX = "http://HQJ-CLOUD-STU";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/eureka/consumer/student/add")
    public boolean addStudent(Student student) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/student/add", student, Boolean.class);
    }

    @RequestMapping(value = "/eureka/consumer/student")
    public List<Student> getStuList() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/student", List.class);
    }

    @RequestMapping(value = "/eureka/consumer/student/{id}")
    public Student getStuById(@PathVariable("id") int id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/student/" + id, Student.class);
    }

}
