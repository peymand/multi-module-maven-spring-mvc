package com.me.services;


import com.me.entities.Teacher;
import com.me.repositories.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
 Author : p-dodangeh
 Date: 2/13/2019
 Time: 11:26 AM
*/
@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherDao teacherDao;

    @Override
    public void saveTeacher(Teacher teacher) {
        teacherDao.saveTeacher(teacher);
    }

    @Override
    public List<Teacher> findAll() {
        return teacherDao.findAll();
    }
}
