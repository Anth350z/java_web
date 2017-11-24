package com.example.java_demo_web.controller;

import com.example.java_demo_web.StudentServices;
import com.example.java_demo_web.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@RestController
public class StudentController {


    @Autowired
    StudentServices studentserv;

    @RequestMapping("/")
    public String index() {
        return "Hello Students";}



//    @RequestMapping("students")
//    public java.util.Hashtable<String, Student> getAll(){
//        return studentserv.getAllStudent();
//    }
//
//    @RequestMapping("students/{id}")
//    public Student getPerson(@PathVariable("id") String id){
//        return studentserv.getStudent(id);
//    }

    @GetMapping(value = "/allstudents")
    public List<Student> getStudent(){
        return studentserv.findAll();
    }

    @PostMapping(value = "/save")
    public List<Student> persist(@RequestBody final Student student){
        studentserv.save(student);
        return studentserv.findAll();
    }
}
