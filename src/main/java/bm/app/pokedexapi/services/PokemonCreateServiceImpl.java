package bm.app.pokedexapi.services;

import bm.app.pokedexapi.dto.PokemonDto;
import bm.app.pokedexapi.mapper.PokemonMapper;
import bm.app.pokedexapi.models.Pokemon;
import bm.app.pokedexapi.repository.PokemonRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Date;

@RequiredArgsConstructor
@Service
public class PokemonCreateServiceImpl implements PokemonCreateService{

    private static final Logger logger = LoggerFactory.getLogger(PokemonCreateServiceImpl.class);
    private final PokemonRepository pokemonRepository;
    private final PokemonMapper pokemonMapper;

    @Override
    public PokemonDto createPokemon(PokemonDto pokemonDto) {
        pokemonDto.setCreatedAt(new Date());

        Pokemon savedPokemon = pokemonRepository.save(pokemonMapper.pokemonDtoToPokemon(pokemonDto));
        logger.info("Pokemon created: " + pokemonDto.getName());
        return pokemonMapper.pokemonToPokemonDto(savedPokemon);
    }
}
