package com.me.serviceContractImpl;

import com.me.Dao.PersonDao;
import com.me.entities.Person;
import com.me.serviceContracts.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/* com.me.serviceContractImpl
@Author:Peyman
Date: 14/02/2019
Time: 10:02 AM
Year: 2019
*/
@Transactional
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonDao personDao;

    @Override
    public void save(Person person) {
        personDao.save(person);
    }
}
