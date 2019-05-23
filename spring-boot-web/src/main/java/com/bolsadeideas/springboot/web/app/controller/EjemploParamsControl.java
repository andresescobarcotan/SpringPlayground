package com.bolsadeideas.springboot.web.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsControl {
	@GetMapping("/")
	public String index() {
		
		return "params/index";
	}
	
	@GetMapping("/string")
	public String param(@RequestParam(name="texto", required=false, defaultValue = "algún valor") String texto, Model model) {
		model.addAttribute("resultado", "El texto esperado es: "+texto);
		return "params/ver";
	}
	
	@GetMapping("/mix-params")
	public String param(HttpServletRequest request, Model model) {
		String saludo = request.getParameter("saludo");
		Integer numero = 0;
		try {
			numero = Integer.parseInt(request.getParameter("numero"));	
		} catch (NumberFormatException e) {
			numero = 0;
		}
		
		model.addAttribute("resultado", "El saludo enviado es: "+saludo +"y el numero es: "+ numero+ " ");
		return "params/ver";
	}

}
