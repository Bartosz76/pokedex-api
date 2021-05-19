package bm.app.pokedexapi.controller;

import bm.app.pokedexapi.dto.PokemonDto;
import bm.app.pokedexapi.services.PokemonCreateService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.net.MalformedURLException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class PokemonController {

    private final PokemonCreateService pokemonCreateService;

    @PostMapping("/create")
    @ApiOperation(value = "Add a new Pokemon to the pokedex!", notes = "When provided a Pokemon's name, it will add the Pokemon's info to the database. If such a Pokemon exists.", response = PokemonDto.class)
    public PokemonDto createPokemon(@RequestParam String name) throws MalformedURLException {
        return pokemonCreateService.createPokemon(name);
    }
}
