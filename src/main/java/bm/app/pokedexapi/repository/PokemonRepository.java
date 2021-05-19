package bm.app.pokedexapi.repository;

import bm.app.pokedexapi.models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, UUID> {

    Pokemon findByName(String name);
    Pokemon findByNumber(int id);
}
