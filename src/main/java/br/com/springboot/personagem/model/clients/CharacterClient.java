package br.com.springboot.personagem.model.clients;

import br.com.springboot.personagem.model.clients.model.character.Character;
import br.com.springboot.personagem.model.clients.model.character.CharacterInfoResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
@FeignClient(name="rickandmortyapi",url="https://rickandmortyapi.com/api/")
public interface CharacterClient {
    @GetMapping("character/{id}")
    Character getCharacterById(@PathVariable Integer id);

    @GetMapping("character")
    CharacterInfoResult getAllCharacter();
}

