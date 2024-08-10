package com.ivoronline.springboot_db_multitenant_multipleentities.repository;

import com.ivoronline.springboot_db_multitenant_multipleentities.entity.Person1;
import org.springframework.data.repository.CrudRepository;

public interface Person1Repository extends CrudRepository<Person1, Integer> { }
