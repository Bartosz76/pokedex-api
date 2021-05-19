package bm.app.pokedexapi.services;

import bm.app.pokedexapi.dto.PokemonDto;

import java.net.MalformedURLException;

public interface PokemonCreateService {

    PokemonDto createPokemon(String name) throws MalformedURLException;
}
