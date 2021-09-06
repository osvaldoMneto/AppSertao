package com.digitalolk.appOsvaldo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.digitalolk.appOsvaldo.model.domain.Artista;
import com.digitalolk.appOsvaldo.model.service.ArtistaService;
import com.digitalolk.appOsvaldo.model.service.UsuarioService;



@Controller
public class ArtistaController {
	
	@Autowired//instancia em todos os lugares necessarios o meu objeto
	private ArtistaService artistaService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value="/")
	public String inicializa() {
		return"index";
	}
	
	@GetMapping(value="/artista")
	public String telaCadastro(Model model) {
		
		usuarioService.obterLista();
		
		model.addAttribute("usuariosLista", usuarioService.obterLista());
		
		return"artista/cadastro";

	}
		
	@GetMapping(value="/artista/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id) {
		
		
		Artista artistaExcluido = artistaService.obterPorId(id);
		
		String msg = " Não Foi impossível realizar a exclusão";
		
		artistaService.excluir(id);
		
		msg=  "O Artista " + artistaExcluido.getNome()+ " foi excluído com sucesso!!!";
		
		
		model.addAttribute("mensagem", msg);
			
		return obterLista(model);
	}
	

	@PostMapping(value = "/artista/incluir") 
	public String incluir( Model model, Artista artista) {
		
		artistaService.incluir(artista);
			
		model.addAttribute("mensagem", "O artista " +artista.getNome() +  "foi cadastrado com sucesso!!");
			
		return obterLista(model);
	}
	
	@GetMapping(value="/artista/{id}/consultar")
	public String consultar(Model model, @PathVariable Integer id) {
		
		
		Artista artista = artistaService.obterPorId(id);
		
		model.addAttribute("meuArtista", artista);
		
		return telaCadastro(model);
	}
	
	@GetMapping(value="/artista/lista")
	public String obterLista(Model model) {
		
	model.addAttribute("artistas", artistaService.obterLista());
		
	return "artista/lista";
		}	
		
	@GetMapping( value = "/voltar")
	public String voltar() {
	
		return "redirect:/artista/lista";
				
	}
		
	@PostMapping(value="/artista/ordenar")
	public String ordenar( Model model, @RequestParam String sortBy) {
		
		model.addAttribute("artista", artistaService.obterLista(sortBy));
		
		return "/artista/lista";
		}
	}
	
	