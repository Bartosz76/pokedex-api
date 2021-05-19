package bm.app.pokedexapi.mapper;

import bm.app.pokedexapi.dto.PokemonDto;
import bm.app.pokedexapi.models.Pokemon;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class PokemonMapperImpl implements PokemonMapper{

    @Override
    public Pokemon pokemonDtoToPokemon(PokemonDto pokemonDto) {
        return Pokemon.builder()
                .number(pokemonDto.getNumber())
                .name(pokemonDto.getName())
                .type(pokemonDto.getType())
                .pokedexEntry(pokemonDto.getPokedexEntry())
                .build();
    }

    @Override
    public PokemonDto pokemonToPokemonDto(Pokemon pokemon) {
        return PokemonDto.builder()
                .number(pokemon.getNumber())
                .name(pokemon.getName())
                .type(pokemon.getType())
                .pokedexEntry(pokemon.getPokedexEntry())
                .build();
    }
}
