package com.example.shoes.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Shoes not found")
public class ShoesNotFoundException extends RuntimeException {

}
