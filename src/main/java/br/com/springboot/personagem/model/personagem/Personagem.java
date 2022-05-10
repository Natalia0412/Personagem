package br.com.springboot.personagem.model.personagem;

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
public class Personagem {
    private Integer id;
    private String nome;
    private String estado;
    private String  especie;
    private String tipo;
    private String genero;
    private PersonagemOrigem origem;
    private PersonagemLocalizacao localizacao;
    private String imagem;
    private List<String> episodio;
    private String url;
    private LocalDateTime dataCriacao;

}
