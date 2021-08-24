package com.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/habilidades")
@RestController

public class Habilidades {
	
	@GetMapping
	public String habilidades() {
		return "Habilidades: Orientação ao detalhe </br>"
				+ "Mentalidade: Persistência";
	}
}
