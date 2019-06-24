package br.com.walldev.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CervejaController {
	@RequestMapping("/cervejas/novo")
	public String criar() {
		return "cerveja/CadastroCerveja";
	}
}