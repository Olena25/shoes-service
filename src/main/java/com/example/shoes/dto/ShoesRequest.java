package com.example.shoes.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoesRequest {


  private String model;
  private String make;
  @JsonProperty(value = "photo_url")
  private String photoUrl;
  private int price;
  private int amount;

}
