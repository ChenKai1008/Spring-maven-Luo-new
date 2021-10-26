package com.chenkai.pojo;

import org.springframework.stereotype.Component;

/**com.chenkai.pojo.Student
 * @author chenkai
 **/
@Component
public class Student {
    private Integer id;
    private String name;

    Student(){
        System.out.println("无参构造");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public void ini(){
        System.out.println("初始化");
    }
    public void des(){
        System.out.println("销毁");
    }
}
