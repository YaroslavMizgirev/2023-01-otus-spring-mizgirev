package com.mym.spring.service;

import com.mym.spring.domain.Person;

public interface PersonService {
    Person getByName(String name);
}
