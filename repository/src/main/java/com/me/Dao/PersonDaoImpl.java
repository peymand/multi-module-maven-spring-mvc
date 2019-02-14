package com.me.Dao;

import com.me.entities.Person;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/* com.me.Dao
@Author:Peyman
Date: 14/02/2019
Time: 10:42 AM
Year: 2019
*/
@Repository
public class PersonDaoImpl implements PersonDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void save(Person person) {
        sessionFactory.openSession().save(person);
    }
}
