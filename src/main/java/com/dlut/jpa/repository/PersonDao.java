package com.dlut.jpa.repository;

import com.dlut.jpa.domain.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "people")
public interface PersonDao extends CrudRepository<Person,Long>
{
}
