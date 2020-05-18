package com.projetofinal.VMPerUse.controller;

import java.util.ArrayList;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.projetofinal.VMPerUse.dao.UsuarioDAO;
import com.projetofinal.VMPerUse.model.Usuario;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	private final UsuarioDAO UsuarioDAO;
	
	public UsuarioController(com.projetofinal.VMPerUse.dao.UsuarioDAO usuarioDAO) {
		super();
		UsuarioDAO = usuarioDAO;
	}
	@GetMapping("/usuarios")
	public ResponseEntity< ArrayList<Usuario> > BuscarTodos(){
		ArrayList<Usuario> lista = (ArrayList<Usuario>)UsuarioDAO.findAll();
		return ResponseEntity.ok(lista);
	}
	@PostMapping("/login2")
	
	public ResponseEntity<Usuario> RecuperarUser(@RequestBody Usuario incompleto){
		
		Usuario userRacf = UsuarioDAO.findByRacfAndSenha(incompleto.getRacf(), incompleto.getSenha());
		
		if(userRacf != null) {
			return ResponseEntity.ok(userRacf);
		}
		else {
			Usuario userEmail = UsuarioDAO.findByEmailAndSenha(incompleto.getEmail(), incompleto.getSenha());
			if(userEmail != null) {
				return ResponseEntity.ok(userEmail);
			}
			else{
				return ResponseEntity.notFound().build();
			}
		}
	}
	/*
	@GetMapping("/login")
	public void validateUser(@RequestParam("user") String user, @RequestParam("senha") String senha) throws Exception{
		ArrayList<Usuario> userRacf;
		userRacf = (ArrayList<Usuario>)UsuarioDAO.findByRacfAndSenha(user, senha);
		if(!userRacf.isEmpty()) {
			throw new Exception("Acesso liberado!");
		}
		else {
			ArrayList<Usuario> userEmail;
			userEmail = (ArrayList<Usuario>)UsuarioDAO.findByEmailAndSenha(user, senha);
			if(userEmail.isEmpty()) {
				throw new Exception("Acesso negado! Usuário ou Senha inválidos.");
			}
			else {
				throw new Exception("Acesso liberado!");
			}
		}
	}
	*/
}