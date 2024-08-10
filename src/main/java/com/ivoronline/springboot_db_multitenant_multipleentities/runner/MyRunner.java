package com.ivoronline.springboot_db_multitenant_multipleentities.runner;

import com.ivoronline.springboot_db_multitenant_multipleentities.entity.Person1;
import com.ivoronline.springboot_db_multitenant_multipleentities.entity.Person2;
import com.ivoronline.springboot_db_multitenant_multipleentities.repository.Person1Repository;
import com.ivoronline.springboot_db_multitenant_multipleentities.repository.Person2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

  //PROPERTIES
  @Autowired Person1Repository person1Repository;
  @Autowired Person2Repository person2Repository;

  //=========================================================================================================
  // INSERT RECORDS
  //=========================================================================================================
  @Override
  public void run(String... args) {
    person1Repository.save(new Person1(0, "John1" , 10));
    person2Repository.save(new Person2(0, "John2" , 20));
  }

}
