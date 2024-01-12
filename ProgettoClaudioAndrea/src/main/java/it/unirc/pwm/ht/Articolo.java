package it.unirc.pwm.ht;
// Generated 12 dic 2023, 16:08:36 by Hibernate Tools 6.1.3.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Articolo generated by hbm2java
 */
public class Articolo implements java.io.Serializable {

	private Integer idArticolo;
	private Venditore venditore;
	private Prodotto prodotto;
	private float prezzo;
	private int quantita;
	private Set compones = new HashSet(0);
	private Set dispones = new HashSet(0);

	public Articolo() {
	}

	@Override
	public String toString() {
		return "Articolo [idArticolo=" + idArticolo + ", venditore=" + venditore.getIdVenditore() + ", prodotto=" + prodotto
				+", prezzo=" + prezzo + ", quantita=" + quantita + "]";
	}

	public Articolo(Venditore venditore, Prodotto prodotto, float prezzo, int quantita) {
		this.venditore = venditore;
		this.prodotto = prodotto;
		this.prezzo = prezzo;
		this.quantita = quantita;
	}

	public Articolo(Venditore venditore, Prodotto prodotto, float prezzo, int quantita, Set compones, Set dispones) {
		this.venditore = venditore;
		this.prodotto = prodotto;
		this.prezzo = prezzo;
		this.quantita = quantita;
		this.compones = compones;
		this.dispones = dispones;
	}

	public Integer getIdArticolo() {
		return this.idArticolo;
	}

	public void setIdArticolo(Integer idArticolo) {
		this.idArticolo = idArticolo;
	}

	public Venditore getVenditore() {
		return this.venditore;
	}

	public void setVenditore(Venditore venditore) {
		this.venditore = venditore;
	}

	public Prodotto getProdotto() {
		return this.prodotto;
	}

	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}

	public float getPrezzo() {
		return this.prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public int getQuantita() {
		return this.quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public Set getCompones() {
		return this.compones;
	}

	public void setCompones(Set compones) {
		this.compones = compones;
	}

	public Set getDispones() {
		return this.dispones;
	}

	public void setDispones(Set dispones) {
		this.dispones = dispones;
	}

}
