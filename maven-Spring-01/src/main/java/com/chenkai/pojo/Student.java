package com.chenkai.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * com.chenkai.pojo.Student
 *
 * @author chenkai
 **/
@Component
public class Student {
    @Value("21")
    private Integer id;
    @Value("你在干什么")
    private String name;
    @Autowired
    private Hobby hobby;


    public void setId(Integer id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobby=" + hobby +
                '}';
    }

    public void ini() {
        System.out.println("初始化");
    }

    public void des() {
        System.out.println("销毁");
    }
}
