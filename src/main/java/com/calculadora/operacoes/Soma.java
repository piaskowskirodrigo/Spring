package com.calculadora.operacoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/soma")
public class Soma {
	
	private Integer numero1 = 10;
	private Integer numero2= 5;
	
	private Integer soma = numero1 + numero2;
	
	@GetMapping
	public Integer calc() {
		return soma;
	
	}

	
	}


