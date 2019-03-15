package com.dlut.jpa.repository;

import com.dlut.jpa.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "persondao")
public interface PersonRepository extends JpaRepository<Person , Long>
{
    //@Override
    //List<Person> findAll();

    //List<Person> findByAddress(String name);

    //Person findByNameStartsWith(String name);

}
