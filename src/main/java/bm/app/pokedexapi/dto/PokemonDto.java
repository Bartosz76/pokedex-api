package bm.app.pokedexapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PokemonDto {

    @JsonProperty("id")
    private int number;
    @JsonProperty("name")
    private String name;
    @JsonProperty("height")
    private int height;
    @JsonProperty("weight")
    private int weight;
    @JsonProperty("createdAt")
    private Date createdAt;

}
