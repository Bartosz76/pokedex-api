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
                .height(pokemonDto.getHeight())
                .weight(pokemonDto.getWeight())
                .build();
    }

    @Override
    public PokemonDto pokemonToPokemonDto(Pokemon pokemon) {
        return PokemonDto.builder()
                .number(pokemon.getNumber())
                .name(pokemon.getName())
                .height(pokemon.getHeight())
                .weight(pokemon.getWeight())
                .build();
    }
}
