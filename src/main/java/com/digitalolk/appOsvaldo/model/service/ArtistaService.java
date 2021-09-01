package com.digitalolk.appOsvaldo.model.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.digitalolk.appOsvaldo.model.domain.Artista;
import com.digitalolk.appOsvaldo.model.repository.ArtistaRepository;

@Service
public class ArtistaService {
	
	@Autowired
	private ArtistaRepository artistaRepository;
	
	public List<Artista>obterLista(String campo){
		
		return (List<Artista>) artistaRepository.findAll(Sort.by(Sort.Direction.ASC,campo));//defini em ordem crescente 
	}

	public List<Artista> obterLista() {

		return (List<Artista>) artistaRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));// define em ordem
																								// crescente
	}	
	public void incluir( Artista artista) {
		artistaRepository.save(artista);
		//colecaoArtistas.add(artista);
	}
	
	public void excluir( Integer id) {
		artistaRepository.deleteById(id);
		//colecaoArtistas.remove(colecaoArtistas.get(id-1));
	}

	public Artista obterPorId(Integer id) {
		return artistaRepository.findById(id).orElse(null);
	}
	
}