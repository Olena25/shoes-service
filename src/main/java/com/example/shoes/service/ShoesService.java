package com.example.shoes.service;

import com.example.shoes.dto.ShoesRequest;
import com.example.shoes.dto.ShoesResponse;
import com.example.shoes.exceptions.ShoesNotFoundException;
import com.example.shoes.mapper.ShoesMapper;
import com.example.shoes.model.Shoes;
import com.example.shoes.repository.ShoesRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ShoesService {

  private ShoesRepository shoesRepository;
  private ShoesMapper shoesMapper;

  public ShoesResponse createShoes(ShoesRequest shoesRequest) {

    Shoes shoes = shoesMapper.mapToShoes(shoesRequest);
    shoesRepository.save(shoes);
    return shoesMapper.mapToShoesResponse(shoes);

  }

  public ShoesResponse updateShoes(int id, ShoesRequest shoesRequest) {
    Shoes shoes = shoesRepository.findById(id).orElseThrow(ShoesNotFoundException::new);

    shoes.setModel(shoesRequest.getModel());
    shoes.setAmount(shoesRequest.getAmount());
    shoes.setMake(shoesRequest.getMake());
    shoes.setPrice(shoesRequest.getPrice());
    shoes.setPhotoUrl(shoesRequest.getPhotoUrl());

    shoesRepository.save(shoes);

    return shoesMapper.mapToShoesResponse(shoes);

  }

  public ShoesResponse deleteShoes(int id) {
    Shoes shoes = shoesRepository.findById(id).orElseThrow(ShoesNotFoundException::new);
    shoesRepository.delete(shoes);
    return shoesMapper.mapToShoesResponse(shoes);
  }

  public List<ShoesResponse> getAllShoes() {
    List<Shoes> shoesList = shoesRepository.findAll();
    return shoesMapper.mapToShoesResponse(shoesList);
  }
}
