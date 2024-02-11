package com.pokeapi.MicroserviciosPokeApi.controller;

import com.pokeapi.MicroserviciosPokeApi.dto.PokemonDTO;
import com.pokeapi.MicroserviciosPokeApi.repository.PokeAPIClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

    // Inyectando el APICliente que se creo con Feign
    @Autowired
    private PokeAPIClient pokeAPIClient;

    @GetMapping("/pokemon/{pokemonId}")
    public PokemonDTO getPokemonInfo(@PathVariable ("pokemonId") int pokemonId) {
        return pokeAPIClient.getPokemonInfo(pokemonId);
    }


}
