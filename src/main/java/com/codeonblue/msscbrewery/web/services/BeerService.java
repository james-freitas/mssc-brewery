package com.codeonblue.msscbrewery.web.services;

import com.codeonblue.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);
}