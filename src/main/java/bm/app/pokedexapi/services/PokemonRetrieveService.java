package bm.app.pokedexapi.services;

import bm.app.pokedexapi.dto.PokemonDto;

public interface PokemonRetrieveService {

    PokemonDto getPokemon(String name);
}
