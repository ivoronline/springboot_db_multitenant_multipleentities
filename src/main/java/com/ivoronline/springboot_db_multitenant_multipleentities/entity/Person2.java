package com.ivoronline.springboot_db_multitenant_multipleentities.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PERSON", schema = "SCHEMA2")
public class Person2 {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer Id;
  public String  name;
  public Integer age;
}
