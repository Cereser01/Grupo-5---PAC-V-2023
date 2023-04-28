package br.com.cagekeeper.CageKeeper;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Dados {
    @Id
    @GeneratedValue
    private Long id;
    public Long getId() {
		return id;
	}
	public List getDados() {
		return Dados;
	}
	public void setDados(List dados) {
		Dados = dados;
	}
	private List Dados;
}
