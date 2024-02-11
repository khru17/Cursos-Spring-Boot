package com.pokeapi.MicroserviciosPokeApi.repository;


import com.pokeapi.MicroserviciosPokeApi.dto.PokemonDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


// Ya utilizando Feign
// la url es la url base del servicio que se va a consumir
@FeignClient(name = "pokeapi", url = "https://pokeapi.co/api/v2")
public interface PokeAPIClient {

    @GetMapping("/pokemon/{pokemonId}")
    public PokemonDTO getPokemonInfo(@PathVariable ("pokemonId") int pokemonId);

}
