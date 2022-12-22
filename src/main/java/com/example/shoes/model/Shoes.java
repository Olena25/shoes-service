package com.example.shoes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "shoes")
public class Shoes {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String model;
  private String make;
  @Column(name = "photo_url")
  private String photoUrl;
  private int price;
  private int amount;
}
