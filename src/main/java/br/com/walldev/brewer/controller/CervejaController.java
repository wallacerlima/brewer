package br.com.walldev.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.walldev.brewer.model.Cerveja;

@Controller
public class CervejaController {
	
	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.GET)
	public String criar() {
		return "cerveja/CadastroCerveja";
	}
	
	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public String cadastrar(Cerveja cerveja) {
		System.out.println("Teste Post" + cerveja.getSku());
		return null;
	}
}