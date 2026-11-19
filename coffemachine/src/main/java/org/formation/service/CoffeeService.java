package org.formation.service;

import org.formation.dto.CoffeeCreateDto;
import org.formation.dto.CoffeeDto;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface CoffeeService {

    List<CoffeeDto> allCoffees();
    //CoffeeDto oneCoffee(Long id);
    //ResponseEntity<CoffeeDto> oneCoffee(Long id);
    Optional<CoffeeDto> oneCoffee(Long id);
    CoffeeDto create (CoffeeCreateDto dto);
    ///update
    //Optional<CoffeeDto> getCoffee(Long id);
}
