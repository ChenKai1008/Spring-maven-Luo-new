package com.chenkai.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author chenkai
 **/
@Component
public class Hobby {
    @Value("1")
    private int id;
    @Value("打羽毛球")
    private String bb;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBb() {
        return bb;
    }

    public void setBb(String bb) {
        this.bb = bb;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "id=" + id +
                ", bb='" + bb + '\'' +
                '}';
    }
}
