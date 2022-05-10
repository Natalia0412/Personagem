package br.com.springboot.personagem.controller;

import br.com.springboot.personagem.model.personagem.Personagem;
import br.com.springboot.personagem.service.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personagem")
public class PersonagemController {
    @Autowired
    private PersonagemService service;
    @GetMapping("/{id}")
    public Personagem getById(@PathVariable("id")Integer id){
        return service.getById(id);
    }
    @GetMapping
    public List<Personagem>getAllPersonagem(){return service.getAll();}
    @PutMapping("/{id}")
    public Personagem update(@RequestBody Personagem request,@PathVariable("id")Integer id){
        return service.update(request,id);
    }
    @PostMapping
    public Personagem addPersonagem(@RequestBody Personagem insertPersonagem)
    {
        return service.create(insertPersonagem);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){service.delete(id);}

    @PostMapping("/seed")
    public void seed(){service.seed();}



}
