package bm.app.pokedexapi.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PokemonDto {

    private int number;
    private String name;
    private String type;
    private String pokedexEntry;

}
