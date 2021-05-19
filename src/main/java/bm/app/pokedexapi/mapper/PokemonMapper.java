package bm.app.pokedexapi.mapper;

import bm.app.pokedexapi.dto.PokemonDto;
import bm.app.pokedexapi.models.Pokemon;

public interface PokemonMapper {

    Pokemon pokemonDtoToPokemon(PokemonDto pokemonDto);

    PokemonDto pokemonToPokemonDto(Pokemon pokemon);
}
