package br.com.springboot.personagem.service;

import br.com.springboot.personagem.model.personagem.PersonagemLocalizacao;
import br.com.springboot.personagem.model.personagem.Personagem;
import br.com.springboot.personagem.model.personagem.PersonagemOrigem;
import br.com.springboot.personagem.repository.PersonagemRepository;
import br.com.springboot.personagem.model.clients.model.character.Character;
import br.com.springboot.personagem.model.clients.CharacterClient;
import br.com.springboot.personagem.model.clients.model.character.CharacterInfoResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonagemService {
    @Autowired
    private CharacterClient characterClient;
    @Autowired
    private PersonagemRepository repository;
    public List<Personagem> getAll() {
        return repository.findAll();
    }

    public Personagem getById(Integer id){
        return repository.findById(id).orElseThrow();
    }

    public Personagem update(Personagem request, Integer id)
    {
        getById(id);
        request.setId(id);
        return repository.save(request);
    }

    public Personagem create(Personagem request)
    {
        return repository.save(request);
    }

    public void delete(Integer id){
        getById(id);
        repository.deleteById(id);
    }


    private List<Personagem> characterToPersonagemList(List<Character> characters){
        return characters.stream().map(this::characterToPersonagem).collect(Collectors.toList());
    }
    private Personagem characterToPersonagem( Character character){
        PersonagemOrigem personagemOrigem = PersonagemOrigem.builder()
                .nome(character.getOrigin().getName())
                .url(character.getOrigin().getUrl())
                .build();
        PersonagemLocalizacao localizacaoOrigem= PersonagemLocalizacao.builder()
                .nome(character.getLocation().getName())
                .url(character.getLocation().getUrl())
                .build();
        return Personagem.builder()
                .id(character.getId())
                .nome(character.getName())
                .estado(character.getStatus())
                .especie(character.getSpecies())
                .tipo(character.getType())
                .genero(character.getGender())
                .origem(personagemOrigem)
                .localizacao(localizacaoOrigem)
                .imagem(character.getImage())
                .episodio(character.getEpisode())
                .url(character.getUrl())
                .dataCriacao(character.getCreated())
                .build();
    }
    public void seed(){
        repository.deleteAll();
        CharacterInfoResult characters =characterClient.getAllCharacter();
        repository.saveAll(characterToPersonagemList(characters.getResults()));
    }

}
