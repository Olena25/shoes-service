package com.example.shoes.mapper;

import com.example.shoes.dto.ShoesRequest;
import com.example.shoes.dto.ShoesResponse;
import com.example.shoes.model.Shoes;
import java.util.List;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface ShoesMapper {

  ShoesResponse mapToShoesResponse(Shoes shoes);

  Shoes mapToShoes(ShoesRequest shoesRequest);

  List<ShoesResponse> mapToShoesResponse(List<Shoes> shoes);
}
