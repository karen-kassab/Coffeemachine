package org.formation.mapper;

import javax.annotation.processing.Generated;
import org.formation.dto.CoffeeDto;
import org.formation.entity.Coffee;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-11-17T15:40:35+0100",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class CoffeeMapperImpl implements CoffeeMapper {

    @Override
    public CoffeeDto toDto(Coffee coffee) {
        if ( coffee == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        int price = 0;

        id = coffee.getId();
        name = coffee.getName();
        price = coffee.getPrice();

        CoffeeDto coffeeDto = new CoffeeDto( id, name, price );

        return coffeeDto;
    }
}
