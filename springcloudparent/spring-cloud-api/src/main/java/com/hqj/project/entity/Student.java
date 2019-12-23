package com.hqj.project.entity;

import lombok.*;
import lombok.experimental.Accessors;
import sun.applet.Main;

import java.sql.Date;

/**
 * @Author huangqingjia
 * @Create 2019-12-20 20:27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
//@Getter
//@Setter
public class Student {
    private Integer sid;
    private String sname;
    private Date sage;
    private String ssex;
    private String dbsource;


    public static void main(String[] args) {
        Student student = new Student();
        student.setSname("黄庆佳").setSage(new Date(1996,7,11));
        System.out.println(student);
    }
}
