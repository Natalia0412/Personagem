package br.com.springboot.personagem.model.clients.model.character;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RestController
public class CharacterLocation {
    private String name;
    private String url;
}
