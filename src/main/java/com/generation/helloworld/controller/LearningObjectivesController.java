package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/learning-objectives")
public class LearningObjectivesController {
	
	@GetMapping
	public String helloWorld() {
		String learningObjectives = "Aprender mais sobre modelo MVC e construção de API REST usando o Spring";
		
		return "Estas são meus objetivos de aprendizagem da semana: " + learningObjectives;
	}
}