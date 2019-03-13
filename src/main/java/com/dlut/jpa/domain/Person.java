package com.dlut.jpa.domain;

import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Entity
@Slf4j
//@NamedQuery(name = "Person.withNameAndAddressNamedQuery",query = "select p from p where p.nam=?1 and address = ?2")
public class Person
{
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Integer age;

    private String address;

    public Person()
    {

    }

    public Person(String name, Integer age, String address)
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
