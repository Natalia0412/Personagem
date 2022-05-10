package br.com.springboot.personagem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients //habilita o Feign na aplicação
@SpringBootApplication
public class PersonagemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonagemApplication.class, args);
	}

}
