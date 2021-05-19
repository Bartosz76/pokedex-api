package bm.app.pokedexapi.controller;

import bm.app.pokedexapi.dto.PokemonDto;
import bm.app.pokedexapi.services.PokemonCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class PokemonController {

    private final PokemonCreateService pokemonCreateService;

    @PostMapping("/create")
    public PokemonDto createPokemon(@RequestBody PokemonDto pokemonDto) {
        return pokemonCreateService.createPokemon(pokemonDto);
    }

}
