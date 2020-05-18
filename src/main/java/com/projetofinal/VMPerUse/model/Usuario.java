package com.projetofinal.VMPerUse.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tbl_usuario")
public class Usuario {
	@Column(name = "id") 									
	@Id														
	@GeneratedValue(strategy = GenerationType.IDENTITY)		
	private int id;
	@Column(name = "nome", length = 100)
	private String nome;
	@Column(name = "racf", length = 7)
	private String racf;
	@Column(name = "email", length = 100)
	private String email;
	@Column(name = "senha", length =12)
	private String senha;
	@Column(name = "funcional", length = 9)
	private String funcional;
	@Column(name = "cargo", length = 50)
	private String cargo;
	@Column(name = "departamento", length = 100)
	private String departamento;
	@Column(name = "linkfoto")
	private String linkfoto;
	
	@OneToMany(mappedBy = "solicitante", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("solicitante")
	private List<Solicitacoes> pedidos;
	
	public List<Solicitacoes> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Solicitacoes> pedidos) {
		this.pedidos = pedidos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRacf() {
		return racf;
	}
	public void setRacf(String racf) {
		this.racf = racf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getFuncional() {
		return funcional;
	}
	public void setFuncional(String funcional) {
		this.funcional = funcional;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
}
