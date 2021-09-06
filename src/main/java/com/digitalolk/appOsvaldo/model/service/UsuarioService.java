package com.digitalolk.appOsvaldo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.digitalolk.appOsvaldo.model.domain.Usuario;
import com.digitalolk.appOsvaldo.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	 @Autowired
	 private UsuarioRepository usuarioRepository;
	
	 public  List<Usuario>obterLista(){
		 return usuarioRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
	 }
	
	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);		
	}
	
	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);		
	}
	
	public Usuario obterporid(Integer id) {
		return usuarioRepository.findById(id).orElse(null);
	}
	
	

}
