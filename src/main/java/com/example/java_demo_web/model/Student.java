package com.example.java_demo_web.model;

/**
 * Created by Anthony on 10/31/17.
 */
public class Student {


    private int id;
    private String name;
    private String course;
    private int age;

    public Student() {
    }




    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
