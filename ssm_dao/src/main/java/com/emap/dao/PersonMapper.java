package com.emap.dao;

import com.emap.domain.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonMapper {
    int deleteByPrimaryKey(int pid);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}