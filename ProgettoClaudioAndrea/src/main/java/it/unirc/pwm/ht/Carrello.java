package it.unirc.pwm.ht;
// Generated 12 dic 2023, 16:08:36 by Hibernate Tools 6.1.3.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Carrello generated by hbm2java
 */
public class Carrello implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idCarrello;
	private Cliente cliente;
	private boolean attivo;
//	private Set ordines = new HashSet(0);
	private Set compones = new HashSet(0);
	
	@Override
	public String toString() {
		return "Carrello [idCarrello=" + idCarrello + ", cliente=" + cliente.getIdCliente() + ", attivo=" + attivo + "]";
	}


	public Carrello() {
	}

	public Carrello(Cliente cliente, boolean attivo) {
		this.cliente = cliente;
		this.attivo = attivo;
	}

	public Carrello(Cliente cliente, boolean attivo, Set compones) {
		this.cliente = cliente;
		this.attivo = attivo;
//		this.ordines = ordines;
		this.compones = compones;
	}

	public Integer getIdCarrello() {
		return this.idCarrello;
	}

	public void setIdCarrello(Integer idCarrello) {
		this.idCarrello = idCarrello;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public boolean getAttivo() {
		return this.attivo;
	}

	public void setAttivo(boolean attivo) {
		this.attivo = attivo;
	}

//	public Set getOrdines() {
//		return this.ordines;
//	}

//	public void setOrdines(Set ordines) {
//		this.ordines = ordines;
//	}

	public Set getCompones() {
		return this.compones;
	}

	public void setCompones(Set compones) {
		this.compones = compones;
	}

}
