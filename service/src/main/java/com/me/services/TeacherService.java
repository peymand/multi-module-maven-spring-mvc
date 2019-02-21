package com.me.services;


import com.me.entities.Teacher;

import java.util.List;

/*
 Author : p-dodangeh
 Date: 2/13/2019
 Time: 11:26 AM
*/
public interface TeacherService {
    void saveTeacher(Teacher teacher);

    List<Teacher> findAll();
}
