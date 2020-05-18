package com.projetofinal.VMPerUse.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.projetofinal.VMPerUse.model.Usuario;

@Repository
public interface UsuarioDAO extends JpaRepository<Usuario, Integer> {
	
	ArrayList<Usuario> findByRacfAndSenha(String racf, String senha);
	ArrayList<Usuario> findByEmailAndSenha(String email, String senha);

}