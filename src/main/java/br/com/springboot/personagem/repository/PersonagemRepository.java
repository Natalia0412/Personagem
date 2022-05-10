package br.com.springboot.personagem.repository;

import br.com.springboot.personagem.model.personagem.Personagem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonagemRepository extends MongoRepository<Personagem,Integer> {
}
