package com.ivoronline.springboot_db_multitenant_multipleentities.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "SCHEMA1", name = "PERSON")
public class Person1 {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer Id;
  public String  name;
  public Integer age;
}
