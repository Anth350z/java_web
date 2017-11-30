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
        return "Welcome Students DBA";}



    @RequestMapping("student")
    public java.util.Hashtable<String, Student> getAll(){
        return studentserv.getAllStudent();
    }

    @RequestMapping("student/{id}")
    public Student getPerson(@PathVariable("id") String id){
        return studentserv.getStudent(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/student/{key}")
    public void saveStudent(@RequestBody Student student, @PathVariable("key") String key){
        studentserv.addStudent(key,student);

    }

    @RequestMapping(method = RequestMethod.PUT, value="/student/{key}")
   public String updateStudent(@RequestBody Student student, @PathVariable("key") String key){
        return  studentserv.updateStudent(key,student);

    }

    @RequestMapping(method = RequestMethod.DELETE, value="student/{id}/delete")
    public void deleteStudent(@PathVariable("id") String id){
        studentserv.deleteStudent(id);
    }
}
