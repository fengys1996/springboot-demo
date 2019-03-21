package com.dlut.jpa.service;

import com.dlut.jpa.domain.Person;

public interface PersonService
{
    public Person save(Person person);

    public void remove(Person person);

    public Person findOne(Person person);
}
