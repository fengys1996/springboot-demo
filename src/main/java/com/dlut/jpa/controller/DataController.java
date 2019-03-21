package com.dlut.jpa.controller;

import com.dlut.jpa.domain.Person;
import com.dlut.jpa.repository.PersonRepository;
import com.dlut.jpa.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController
{
    @Autowired
    PersonRepository personRepository;

    @RequestMapping("/findAll")
    public List<Person> findAll()
    {
        return personRepository.findAll();
    }

    @RequestMapping("/findByAddress")
    public List<Person> findByAddress(String address)
    {
        //return personRepository.findByAddress(address);
        return null;
    }

    @RequestMapping("/findAll1")
    public String findAll1()
    {
        return "123";
    }

    @RequestMapping("/save")
    public void save(String name,String address,Integer age)
    {
        personRepository.save(new Person(name,age,address));
    }

    @RequestMapping("/sort")
    public List<Person> sort()
    {
        List<Person> personList = personRepository.findAll(new Sort(Sort.Direction.ASC,"id"));
        return personList;
    }

    @RequestMapping("/page")
    public Page<Person> page()
    {
        Page<Person> pagePeople = personRepository.findAll(new PageRequest(1,2));
        return pagePeople;
    }

    @Autowired
    PersonService personService;

    @RequestMapping("/findOnePerson")
    public Person findOnePerson()
    {
        Person p = new Person();
        p.setId(Long.valueOf(1));
        return personService.findOne(p);
    }
}
