package com.hqj.project.service;

import com.hqj.project.entity.Student;
import com.hqj.project.service.factory.StuClientFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author huangqingjia
 * @Create 2019-12-23 1:56
 */
@FeignClient(value = "HQJ-CLOUD-STU", fallbackFactory = StuClientFallbackFactory.class)
public interface StudentFeignService {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public List<Student> getStuList();

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public Student getStuById(@PathVariable("id") int id);

    @RequestMapping(value = "/student/add", method = RequestMethod.POST)
    public boolean addStudent(@RequestBody Student student);
}
