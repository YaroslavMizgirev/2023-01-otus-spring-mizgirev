package com.mym.spring.service;

import com.mym.spring.dao.PersonDao;
import com.mym.spring.domain.Person;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonDao dao;

    @Override
    public Person getByName(String name) {
        return dao.findByName(name);
    }
}
