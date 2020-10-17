package com.group03.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.group03.demo.enums.NumerosEnum;

@SpringBootApplication
public class Nokia1100Application {

	public static void main(String[] args) {
		SpringApplication.run(Nokia1100Application.class, args);
		
		System.out.println(NumerosEnum.retornaLetra(9999));
		
	}

}
