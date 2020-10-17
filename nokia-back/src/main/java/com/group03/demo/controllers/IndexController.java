package com.group03.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String receberNumeros(int numero) {
		
		String letra = Integer.toString(numero);
		
		letra.length();
		
		char[][] matriz = new char[5][8];   //2 3 4 5 6 7 8 9
											//a d       p 
											//b e		q
											//c f       r
		String letrasChars = "";                      //s
		String numerosChar = "";
		
		String alfabeto = "abcdefghijklmnopqrstuvwxyz";
		String numeros = "23456789";
		
		for (int i = 0; i < alfabeto.length(); i++) {

			char c = alfabeto.charAt(i);
			
			letrasChars += c;
				
			if (letrasChars.length() >= 25)
				break;
		}
		
		for (int i = 0; i < numeros.length(); i++) {

			char c = alfabeto.charAt(i);
			
			numeros += c;
				
			if (numeros.length() >= 25)
				break;
		}
		
		
		

		System.out.println("MATRIZ: ");
		for (int i = 0; i < numerosChar.length(); i++) {
			for (int j = 0; j < letrasChars.length(); j++) {
				
				if (i == 0 && j == 0) {
					matriz[i][j] = numerosChar.charAt(j);
				}
				
				matriz[i][j] = letrasChars.charAt(numerosChar.charAt(i));
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		return "index";
	}

}
