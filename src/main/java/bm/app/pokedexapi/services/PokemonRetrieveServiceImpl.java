package bm.app.pokedexapi.services;

import bm.app.pokedexapi.dto.PokemonDto;
import bm.app.pokedexapi.mapper.PokemonMapper;
import bm.app.pokedexapi.models.Pokemon;
import bm.app.pokedexapi.repository.PokemonRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service
public class PokemonRetrieveServiceImpl implements PokemonRetrieveService{

    private static final Logger logger = LoggerFactory.getLogger(PokemonCreateServiceImpl.class);
    private final PokemonMapper pokemonMapper;
    private final PokemonRepository pokemonRepository;
    private final RestTemplate restTemplate = new RestTemplate();

    @Override
    public PokemonDto getPokemon(String name) {
        PokemonDto foundPokemon = pokemonMapper.pokemonToPokemonDto(pokemonRepository.findByName(name));
        logger.info("Found Pokemon: " + foundPokemon);
        return foundPokemon;
    }
}
