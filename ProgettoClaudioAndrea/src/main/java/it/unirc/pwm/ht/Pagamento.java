package it.unirc.pwm.ht;
// Generated 12 dic 2023, 16:08:36 by Hibernate Tools 6.1.3.Final

import java.sql.Date;

/**
 * Pagamento generated by hbm2java
 */
public class Pagamento implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numeroOrdine;
	private CartaCredito cartacredito;
	private Ordine ordine;
	private Date data;

	public Pagamento() {
	}

	public Pagamento(CartaCredito cartacredito, Ordine ordine, Date data) {
		this.cartacredito = cartacredito;
		this.ordine = ordine;
		this.data = data;
	}

	public int getNumeroOrdine() {
		return this.numeroOrdine;
	}

	public void setNumeroOrdine(int numeroOrdine) {
		this.numeroOrdine = numeroOrdine;
	}

	public CartaCredito getCartacredito() {
		return this.cartacredito;
	}

	public void setCartacredito(CartaCredito cartacredito) {
		this.cartacredito = cartacredito;
	}

	public Ordine getOrdine() {
		return this.ordine;
	}

	public void setOrdine(Ordine ordine) {
		this.ordine = ordine;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
