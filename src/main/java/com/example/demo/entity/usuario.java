package com.example.demo.entity;


import javax.persistence.*;

@Entity
public class usuario {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
@Column(name = "name")
private String name;
@Column (name = "age")
private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
