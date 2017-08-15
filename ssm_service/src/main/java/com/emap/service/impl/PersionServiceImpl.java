package com.emap.service.impl;

import com.emap.dao.PersonMapper;
import com.emap.domain.Person;
import com.emap.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("personService")
public class PersionServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;
    public Person getPersonById(Integer userId) {
        System.err.println(personMapper == null);
        return personMapper.selectByPrimaryKey(userId);
    }

    public void insert(Person record) {
        personMapper.insert(record);
    }

    public void updateByPrimaryKey(Person record) {
        personMapper.updateByPrimaryKey(record);
    }

    public void deleteByPrimaryKey(int pid) {
        personMapper.deleteByPrimaryKey(pid);
    }
}
