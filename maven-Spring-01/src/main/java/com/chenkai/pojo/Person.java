package com.chenkai.pojo;

import org.springframework.stereotype.Component;

import java.security.Principal;
import java.security.PrivateKey;
import java.sql.SQLOutput;

/**
 * @author chenkai
 **/
@Component
public class Person {
    private String name;
    private int age;
    Person(){
        System.out.println("person初始化");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
