package bm.app.pokedexapi.services;

import bm.app.pokedexapi.dto.PokemonDto;

public interface PokemonCreateService {

    PokemonDto createPokemon(PokemonDto pokemonDto);
}
