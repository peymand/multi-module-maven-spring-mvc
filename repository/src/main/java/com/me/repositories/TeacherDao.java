package com.me.repositories;


import com.me.entities.Teacher;

import java.util.List;

/*
 Author : p-dodangeh
 Date: 2/13/2019
 Time: 11:19 AM
*/
public interface TeacherDao {
    void saveTeacher(Teacher teacher);
    List<Teacher> findAll();
}
