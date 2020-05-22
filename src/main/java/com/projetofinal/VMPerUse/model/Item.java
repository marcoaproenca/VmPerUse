package com.projetofinal.VMPerUse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_item")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numItem")
	private int numItem;
	@ManyToOne
	private Software software;
	@ManyToOne
	private Solicitacao solicitacao;
	
	public int getNumItem() {
		return numItem;
	}
	public void setNumItem(int numItem) {
		this.numItem = numItem;
	}
	public Software getSoftware() {
		return software;
	}
	public void setSoftware(Software software) {
		this.software = software;
	}
	public Solicitacao getSolicitaco() {
		return solicitacao;
	}
	public void setSolicitaco(Solicitacao solicitaco) {
		this.solicitacao = solicitaco;
	}
}
	