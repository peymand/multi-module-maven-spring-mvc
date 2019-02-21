package com.me.repositories;

import com.me.entities.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/*
 Author : p-dodangeh
 Date: 2/13/2019
 Time: 11:19 AM
*/
@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void saveStudent(Student student) {
        sessionFactory.openSession().save(student);
    }
}
