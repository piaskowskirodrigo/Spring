package com.calculadora.operacoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/divide")
public class Divisao {
	
	private Integer numero1 = 10;
	private Integer numero2= 5;
	
	private Integer divide = numero1 / numero2;
	
	
	@GetMapping
	public Integer calc() {
		//*System.out.println("A divisao do numeo "+ numero1+" e do numero "+numero2+"e = ");
	
		return divide;
	
	}

	
	}
