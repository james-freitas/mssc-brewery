package com.codeonblue.msscbrewery.web.mappers;

import com.codeonblue.msscbrewery.domain.Beer;
import com.codeonblue.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
