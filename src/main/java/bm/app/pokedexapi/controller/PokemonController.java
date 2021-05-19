package bm.app.pokedexapi.controller;

import bm.app.pokedexapi.services.PokemonCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class PokemonController {

    private final PokemonCreateService pokemonCreateService;

}
