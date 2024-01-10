package it.unirc.pwm.ht;
// Generated 12 dic 2023, 16:08:36 by Hibernate Tools 6.1.3.Final

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cartacredito generated by hbm2java
 */
public class CartaCredito implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idCartaCredito;
	private long numeroCarta;
	private int codiceSicurezza;
	private String intestatario;
//	private Cliente cliente;
	private Set<Cliente> clientes = new HashSet<Cliente>(0);
	private Set pagamentos = new HashSet(0);
//	ciao

	public CartaCredito() {
	}

	

	@Override
	public String toString() {
		return "CartaCredito [idCartaCredito=" + idCartaCredito + ", numeroCarta=" + numeroCarta + ", codiceSicurezza="
				+ codiceSicurezza + ", intestatario=" + intestatario + "]";
	}



	public CartaCredito(long numeroCarta, int codiceSicurezza, String intestatario) {
		this.numeroCarta = numeroCarta;
		this.codiceSicurezza = codiceSicurezza;
//		this.dataScadenza = dataScadenza;
		this.intestatario = intestatario;
	}

	public CartaCredito(long numeroCarta, int codiceSicurezza, Date dataScadenza, String intestatario, Set <Cliente> clientes) {
		this.numeroCarta = numeroCarta;
		this.codiceSicurezza = codiceSicurezza;
//		this.dataScadenza = dataScadenza;
		this.intestatario = intestatario;
		this.clientes= clientes;
//		this.pagamentos = pagamentos;
	}

	public Integer getIdCartaCredito() {
		return this.idCartaCredito;
	}

	public void setIdCartaCredito(Integer idCartaCredito) {
		this.idCartaCredito = idCartaCredito;
	}

	public long getNumeroCarta() {
		return this.numeroCarta;
	}

	public void setNumeroCarta(long numeroCarta) {
		this.numeroCarta = numeroCarta;
	}

	public int getCodiceSicurezza() {
		return this.codiceSicurezza;
	}

	public void setCodiceSicurezza(int codiceSicurezza) {
		this.codiceSicurezza = codiceSicurezza;
	}

//	public Date getDataScadenza() {
//		return this.dataScadenza;
//	}
//
//	public void setDataScadenza(Date dataScadenza) {
//		this.dataScadenza = dataScadenza;
//	}

	public String getIntestatario() {
		return this.intestatario;
	}

	public void setIntestatario(String intestatario) {
		this.intestatario = intestatario;
	}

//	public Cliente getCliente() {
//		return this.cliente;
//	}
//
//	public void setCliente(Cliente cliente) {
//		this.cliente = cliente;
//	}
	
	
	public Set<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Set getPagamentos() {
		return this.pagamentos;
	}

	public void setPagamentos(Set pagamentos) {
		this.pagamentos = pagamentos;
	}

}
