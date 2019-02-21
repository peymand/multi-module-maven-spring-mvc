package com.me.repositories;


import com.me.entities.Teacher;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 Author : p-dodangeh
 Date: 2/13/2019
 Time: 11:19 AM
*/
@Repository
public class TeacherDaoImpl implements TeacherDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void saveTeacher(Teacher teacher) {
        sessionFactory.openSession().save(teacher);
    }

    @Override
    public List<Teacher> findAll() {
        return (List<Teacher>) sessionFactory.openSession().createQuery("from Teacher").list();
    }
}
