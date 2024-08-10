package com.ivoronline.springboot_db_multitenant_multipleentities.repository;

import com.ivoronline.springboot_db_multitenant_multipleentities.entity.Person2;
import org.springframework.data.repository.CrudRepository;

public interface Person2Repository extends CrudRepository<Person2, Integer> { }
