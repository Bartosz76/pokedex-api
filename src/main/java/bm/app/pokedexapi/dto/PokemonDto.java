package bm.app.pokedexapi.dto;

import lombok.*;

import java.util.Date;

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
    private Date createdAt;

}
