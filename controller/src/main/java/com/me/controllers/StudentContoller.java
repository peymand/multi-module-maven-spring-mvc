package com.me.controllers;

import com.me.entities.Student;
import com.me.services.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/*
 Author : p-dodangeh
 Date: 2/13/2019
 Time: 11:39 AM
*/
@Controller
public class StudentContoller {
    @Autowired
    StudentService studentService;

    @RequestMapping("/student")
    public String showHome(@ModelAttribute("student") Student student){
        return "index";

    }
    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("student") Student student, BindingResult result){
        if (result.hasErrors()) {
            return "index";
        }
        studentService.saveStudent(student);
        return "done";
    }

}
