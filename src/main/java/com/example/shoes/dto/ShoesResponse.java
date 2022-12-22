package com.example.shoes.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ShoesResponse {

  private int id;
  private String model;
  private String make;
  @JsonProperty("photo_url")
  private String photoUrl;
  private int price;
  private int amount;

}
