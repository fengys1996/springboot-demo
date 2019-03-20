package com.dlut.jpa.service;

import com.dlut.jpa.domain.Person;
import com.dlut.jpa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonServiceImp implements PersonService
{
    @Autowired
    PersonRepository personRepository;


    @Override
    @CachePut(value = "people" , key = "#person.id")
    public Person save(Person person)
    {
        Person p = personRepository.save(person);
        return p;
    }

    @Override
    @CacheEvict(value = "people")
    public void remove(Person person)
    {
        personRepository.delete(person);
    }

    @Override
    @Cacheable(value = "people" , key = "#person.id")
    public Person findOne(Person person)
    {
        Optional<Person> p = personRepository.findOne(new Example<Person>()
        {
            @Override
            public Person getProbe()
            {
                return null;
            }

            @Override
            public ExampleMatcher getMatcher()
            {
                return null;
            }
        });
        return null;
    }
}
