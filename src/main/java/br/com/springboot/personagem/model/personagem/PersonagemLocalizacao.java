package br.com.springboot.personagem.model.personagem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonagemLocalizacao {
    private String nome;
    private String url;
}
