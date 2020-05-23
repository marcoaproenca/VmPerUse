package com.projetofinal.VMPerUse.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projetofinal.VMPerUse.dao.SoftwareDAO;
import com.projetofinal.VMPerUse.model.Software;
import com.projetofinal.VMPerUse.model.Usuario;

@RestController
@CrossOrigin("*")
@RequestMapping("/software")
public class SoftwareController {
	
	SoftwareDAO swDAO;
	
	public SoftwareController(SoftwareDAO swDAO) {
		super();
		this.swDAO = swDAO;
	}
	
	@GetMapping("/")
	public ResponseEntity< ArrayList<Software> > BuscarTodos(){
		ArrayList<Software> lista = (ArrayList<Software>)swDAO.findAll();
		return ResponseEntity.ok(lista);	
	}

}
