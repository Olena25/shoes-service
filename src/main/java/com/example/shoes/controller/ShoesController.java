package com.example.shoes.controller;

import com.example.shoes.dto.ShoesRequest;
import com.example.shoes.dto.ShoesResponse;
import com.example.shoes.service.ShoesService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ShoesController {

  private ShoesService shoesService;

  @PostMapping("/shoes")
  @ResponseStatus(HttpStatus.CREATED)
  public ShoesResponse createShoes(@RequestBody ShoesRequest shoesRequest) {
    return shoesService.createShoes(shoesRequest);
  }

  @GetMapping("/shoes")
  public List<ShoesResponse> getAllShoes() {
    return shoesService.getAllShoes();
  }

  @PutMapping("/shoes/{id}")
  public ShoesResponse updateShoes(@PathVariable int id, @RequestBody ShoesRequest shoesRequest) {
    return shoesService.updateShoes(id, shoesRequest);
  }

  @DeleteMapping("/shoes/{id}")
  public ShoesResponse deleteShoes(@PathVariable int id) {
    return shoesService.deleteShoes(id);
  }

}
