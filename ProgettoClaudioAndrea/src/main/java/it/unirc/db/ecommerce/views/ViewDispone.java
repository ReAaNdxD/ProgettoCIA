package it.unirc.db.ecommerce.views;

import it.unirc.pwm.ht.Articolo;
import it.unirc.pwm.ht.Magazzino;

public class ViewDispone {

	private Articolo articolo;
	private Magazzino magazzino;
	private int quantita;

	public ViewDispone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ViewDispone(Magazzino magazzino, int quantita) {
		super();
		this.magazzino = magazzino;
		this.quantita = quantita;
	}

	public ViewDispone(Articolo articolo, Magazzino magazzino, int quantita) {
		super();
		this.articolo = articolo;
		this.magazzino = magazzino;
		this.quantita = quantita;
	}

	public Articolo getArticolo() {
		return articolo;
	}

	public void setArticolo(Articolo articolo) {
		this.articolo = articolo;
	}

	public Magazzino getMagazzino() {
		return magazzino;
	}

	public void setMagazzino(Magazzino magazzino) {
		this.magazzino = magazzino;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

}
