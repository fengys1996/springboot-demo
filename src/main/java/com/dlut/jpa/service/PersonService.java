package com.dlut.jpa.service;

import com.dlut.jpa.domain.Person;
import com.dlut.jpa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface PersonService
{
    public Person save(Person person);

    public void remove(Person person);

    public Person findOne(Person person);
}
