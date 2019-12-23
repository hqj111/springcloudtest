package com.hqj.project.service.factory;

import com.hqj.project.entity.Student;
import com.hqj.project.service.StudentFeignService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author huangqingjia
 * @Create 2019-12-23 3:25
 */
@Component  //必须使用@Component注解让spring知道
//实现FallbackFactory接口，表示服务降级的备选方案工厂，泛型指的是feign注解过的类
public class StuClientFallbackFactory implements FallbackFactory<StudentFeignService> {
    @Override
    public StudentFeignService create(Throwable throwable) {
        return new StudentFeignService() {
            @Override
            public List<Student> getStuList() {
                return null;
            }

            @Override
            public Student getStuById(int id) {
                return new Student(id, "服务降级，远程寻找名字失败", null, "服务降级，远程寻找年龄失败", "服务降级，远程寻找数据库失败");
            }

            @Override
            public boolean addStudent(Student student) {
                return false;
            }
        };
    }
}
