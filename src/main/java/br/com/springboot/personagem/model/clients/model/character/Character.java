package br.com.springboot.personagem.model.clients.model.character;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Character {
    private Integer id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private CharacterOrigin origin;
    private CharacterLocation location;
    private String image;
    private List<String> episode;
    private String url;
    private LocalDateTime created;
}
