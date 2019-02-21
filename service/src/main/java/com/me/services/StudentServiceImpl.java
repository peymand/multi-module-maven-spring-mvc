package com.me.services;

import com.me.entities.Student;
import com.me.repositories.StudentDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*
 Author : p-dodangeh
 Date: 2/13/2019
 Time: 11:26 AM
*/
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Override
    public void saveStudent(Student student) {
        studentDao.saveStudent(student);
    }
}
