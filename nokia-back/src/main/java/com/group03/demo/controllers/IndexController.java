package com.group03.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.group03.demo.enums.NumerosEnum;

@Controller
public class IndexController {
	
	@GetMapping("/")
    public String receberNumeros(String number) {
        int numberInt = Integer.parseInt(number);
        
        return NumerosEnum.retornaLetra(numberInt).toString();
    }
}
