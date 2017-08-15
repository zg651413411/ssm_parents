package com.emap.service;

import com.emap.domain.Person;


public interface PersonService {
    Person getPersonById(Integer userId);

    void insert(Person record);

    void updateByPrimaryKey(Person record);

    void deleteByPrimaryKey(int pid);
}
