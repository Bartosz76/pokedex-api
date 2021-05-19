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

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

@RequiredArgsConstructor
@Service
public class PokemonCreateServiceImpl implements PokemonCreateService{

    private static final Logger logger = LoggerFactory.getLogger(PokemonCreateServiceImpl.class);
    private final PokemonRepository pokemonRepository;
    private final PokemonMapper pokemonMapper;
    private final RestTemplate restTemplate = new RestTemplate();

    @Override
    public PokemonDto createPokemon(String name) throws MalformedURLException {
        PokemonDto pokemonDto = fetchPokemonDataFromAnExternalApi(name);
        pokemonDto.setCreatedAt(new Date());

        Pokemon savedPokemon = pokemonRepository.save(pokemonMapper.pokemonDtoToPokemon(pokemonDto));
        logger.info("Pokemon created: " + pokemonDto.getName());
        return pokemonMapper.pokemonToPokemonDto(savedPokemon);
    }

    private PokemonDto fetchPokemonDataFromAnExternalApi(String name) throws MalformedURLException {
        return restTemplate.getForObject(provideTheUrl(name).toString(), PokemonDto.class);
    }

    private URL provideTheUrl(String name) throws MalformedURLException {
        URL url = new URL("https://pokeapi.co/api/v2/pokemon/" + name);
        return url;
    }
}
