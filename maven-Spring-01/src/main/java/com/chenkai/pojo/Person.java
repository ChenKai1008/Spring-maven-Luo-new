package com.chenkai.pojo;

import org.springframework.beans.factory.annotation.Value;
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

    @Value("我啥都没干")
    public void setName(String name) {
        this.name = name;
    }

    @Value("250")
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
