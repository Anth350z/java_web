package com.example.java_demo_web.controller;

import com.example.java_demo_web.StudentServices;
import com.example.java_demo_web.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {


    @Autowired
    StudentServices studentserv;

    @RequestMapping("/")
    public String index() {
        return "Hello Students";}



    @RequestMapping("students")
    public java.util.Hashtable<String, Student> getAll(){
        return studentserv.getAllStudent();
    }

    @RequestMapping("students/{id}")
    public Student getPerson(@PathVariable("id") String id){
        return studentserv.getStudent(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/save/{key}")
    public void saveStudent(@RequestBody Student student, @PathVariable("key") String key){
        studentserv.addStudent(key,student);

    }
}
