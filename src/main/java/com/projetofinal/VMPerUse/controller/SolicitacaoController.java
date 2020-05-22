package com.projetofinal.VMPerUse.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetofinal.VMPerUse.dao.SolicitacaoDAO;
import com.projetofinal.VMPerUse.model.Item;
import com.projetofinal.VMPerUse.model.Solicitacao;

@RestController
@RequestMapping("/solicitacao")
public class SolicitacaoController {
	
	SolicitacaoDAO sDAO;
	
	public SolicitacaoController(SolicitacaoDAO sDAO) {
		super();
		this.sDAO = sDAO;
	}

	@PostMapping("/nova")
	public ResponseEntity<Solicitacao> adicionarSolicitacao(@RequestBody Solicitacao nova){
		try {
			for(Item it : nova.getItensSolicitacao()) {
				it.setSolicitaco(nova);
			}
			sDAO.save(nova);
			return ResponseEntity.ok(nova);
		}
		catch(Exception ex) {
			return ResponseEntity.status(400).build();
		}
	}
	
}
