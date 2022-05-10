package br.com.springboot.personagem.model.clients.model.character;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CharacterInfoResult {
    private CharacterInfo info;
    private List<Character> results;

}
