package com.example.java_demo_web;

import com.example.java_demo_web.model.Student;
import org.springframework.stereotype.Service;

import java.util.Hashtable;

/**
 * Created by Anthony on 11/9/17.
 */
@Service
public class StudentServices{

    public Hashtable<String, Student> students = new Hashtable<String, Student>();

    public StudentServices() {

        Student Student1 = new Student();

        Student1.setAge(22);
        Student1.setCourse("math");
        Student1.setId(222);
        Student1.setName("jose");
        students.put("1",Student1);

        Student1 = new Student();
        Student1.setAge(23);
        Student1.setCourse("Biology");
        Student1.setId(111);
        Student1.setName("Maria");
        students.put("2",Student1);


    }

    public Student getStudent(String id){
        if(students.containsKey(id)){
            return students.get(id);
        }else return null;
    }


    public Hashtable <String, Student> getAllStudent(){
    return students;
    }

    public void addStudent(String key,Student student){
        students.put(key,student);

    }
}
