package it.unirc.pwm.ht;
// Generated 12 dic 2023, 16:08:36 by Hibernate Tools 6.1.3.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria implements java.io.Serializable {

	private Integer idCategoria;
	private String nome;
	private String descrizione;
	private Set sottocategorias = new HashSet(0);

	public Categoria() {
	}

	public Categoria(String nome, String descrizione) {
		this.nome = nome;
		this.descrizione = descrizione;
	}

	public Categoria(String nome, String descrizione, Set sottocategorias) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.sottocategorias = sottocategorias;
	}

	public Integer getIdCategoria() {
		return this.idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Set getSottocategorias() {
		return this.sottocategorias;
	}

	public void setSottocategorias(Set sottocategorias) {
		this.sottocategorias = sottocategorias;
	}

}
