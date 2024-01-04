package it.unirc.pwm.ht.join.dao;

import java.util.List;

import it.unirc.pwm.ht.Articolo;
import it.unirc.pwm.ht.Carrello;
import it.unirc.db.ecommerce.views.Compone;

public interface ArticoloComponeCarrelloDAO {
	public boolean aggiungiArticoloCarrello(Articolo articolo, Carrello carrello, int quantita);
	public boolean modifica(Articolo articolo, Carrello carrello, int quantita);
	public boolean elimina(Articolo articolo, Carrello c);
	public List<Compone> articoliCarrello(Carrello c);
	public boolean isArticoloInCarrello(Articolo articolo, Carrello carrello);
	public boolean prova(Carrello carrello, Articolo articolo);
	public boolean aggiornaQuantita(Articolo articolo, Carrello carrello, int quantita);
	public boolean aggiornaPrezzo(Articolo articolo, Carrello carrello) ;
	public double calcoloCosto(Carrello carrello) ;






}
