package com.digitalolk.appOsvaldo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.digitalolk.appOsvaldo.model.domain.Artista;
import com.digitalolk.appOsvaldo.model.service.ArtistaService;



@Controller
public class ArtistaController {
	
	@Autowired//instancia em todos os lugares necessarios o meu objeto
	private ArtistaService artistaService;
	
	@GetMapping(value="/")
	public String inicializa() {
		return"index";
	}
	
	@GetMapping(value="/artista")
	public String telaCadastro() {
		return"artista/cadastro";

	}
		
	@GetMapping(value="/artista/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id) {
		
		
		
		Artista artistaExcluido = artistaService.obterPorId(id);
		
		artistaService.excluir(id);
		
		model.addAttribute("mensagem", "Artista" +artistaExcluido.getNome()+ "excluído com sucesso!!");
			
		return obterLista(model);
	}
	
	@PostMapping(value = "/artista/incluir") 
	public String incluir( Model model, Artista artista) {
		
		
		
		artistaService.incluir(artista);
			
		model.addAttribute("mensagem", "O artista"+artista.getNome()+ "foi cadastrado com sucesso!!");
			
		return obterLista(model);
	}
	
	@GetMapping(value="/artista/consultar")
	public String consultar() {
		return"";
	}
	
		@GetMapping(value="/artista/lista")
		public String obterLista(Model model) {
		
		
		
		model.addAttribute("artistas", artistaService.obterLista());
		
		return "artista/lista";
	}
	
}	