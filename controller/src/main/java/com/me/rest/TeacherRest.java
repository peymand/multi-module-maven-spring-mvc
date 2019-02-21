package com.me.rest;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.me.entities.Teacher;
import com.me.services.TeacherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/*
 Author : p-dodangeh
 Date: 2/13/2019
 Time: 3:33 PM
*/
@RestController
@RequestMapping("/rest/teacher")
public class TeacherRest {

    @Autowired
    TeacherService teacherService;

    @Autowired
    Gson gson;

    @GetMapping("/list")
    public String list() {
        List<JsonObject> list =  new ArrayList<>();
        List<Teacher> all = teacherService.findAll();
        for (Teacher teacher : all) {
            JsonElement element = gson.fromJson(gson.toJson(teacher),JsonElement.class);
            list.add(element.getAsJsonObject());
        }


        return gson.toJson(list);
    }


}
