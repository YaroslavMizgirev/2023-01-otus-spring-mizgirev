package com.mym.spring.dao;

import com.mym.spring.domain.Person;

public interface PersonDao {
    Person findByName(String name);
}
