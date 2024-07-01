package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/bsm-list")
public class BsmListController {

	@GetMapping
	public String helloWorld() {
		String bsm = "Persistência, Mentalidade de Crescimento, Responsabilidade Pessoal, Orientação ao Futuro, "
				+ "Orientação ao Detalhe, Trabalho em Equipe, Comunicação, Proatividade";
		
		return "Estas são as BSM's da Generation: " + bsm;
	}
}
