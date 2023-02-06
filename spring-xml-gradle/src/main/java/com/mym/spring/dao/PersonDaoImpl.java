package com.mym.spring.dao;

import com.mym.spring.domain.Person;

public class PersonDaoImpl implements PersonDao {

    @Override
    public Person findByName(String name) {
        return new Person(name, 18);
    }
}
