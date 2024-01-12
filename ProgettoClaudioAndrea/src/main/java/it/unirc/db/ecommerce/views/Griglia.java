package it.unirc.db.ecommerce.views;

public class Griglia {

	private int idProdotto;
	private int idArticolo;
	private double prezzo;
	private int quantita;
	private String idVenditore;
	private String nomeProdotto;
//	private String marca;
	private String descrizioneBreve;
	private String descrizioneDettagliata;
	
	public Griglia() {
		super();
	}
	
	
	
	public Griglia(int idProdotto, int idArticolo, double prezzo, int quantita, String idVenditore, String nomeProdotto,
			 String descrizioneBreve, String descrizioneDettagliata) {
		super();
		this.idProdotto = idProdotto;
		this.idArticolo = idArticolo;
		this.prezzo = prezzo;
		this.quantita = quantita;
		this.idVenditore = idVenditore;
		this.nomeProdotto = nomeProdotto;
		this.descrizioneBreve = descrizioneBreve;
		this.descrizioneDettagliata = descrizioneDettagliata;
	}



	public int getIdProdotto() {
		return idProdotto;
	}
	public void setIdProdotto(int idProdotto) {
		this.idProdotto = idProdotto;
	}
	public int getIdArticolo() {
		return idArticolo;
	}
	public void setIdArticolo(int idArticolo) {
		this.idArticolo = idArticolo;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getQuantita() {
		return quantita;
	}
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	public String getIdVenditore() {
		return idVenditore;
	}
	public void setIdVenditore(String idVenditore) {
		this.idVenditore = idVenditore;
	}
	public String getNomeProdotto() {
		return nomeProdotto;
	}
	public void setNomeProdotto(String nomeProdotto) {
		this.nomeProdotto = nomeProdotto;
	}
	
	
	public String getDescrizioneBreve() {
		return descrizioneBreve;
	}
	public void setDescrizioneBreve(String descrizioneBreve) {
		this.descrizioneBreve = descrizioneBreve;
	}
	public String getDescrizioneDettagliata() {
		return descrizioneDettagliata;
	}
	public void setDescrizioneDettagliata(String descrizioneDettagliata) {
		this.descrizioneDettagliata = descrizioneDettagliata;
	}



	@Override
	public String toString() {
		return "Griglia [idProdotto=" + idProdotto + ", idArticolo=" + idArticolo + ", prezzo=" + prezzo + ", quantita="
				+ quantita + ", idVenditore=" + idVenditore + ", nomeProdotto=" + nomeProdotto + ", descrizioneBreve="
				+ descrizioneBreve + ", descrizioneDettagliata=" + descrizioneDettagliata + "]";
	}




	
}
