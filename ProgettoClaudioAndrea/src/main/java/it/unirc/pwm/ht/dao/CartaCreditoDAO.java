package it.unirc.pwm.ht.dao;

import java.util.Vector;

import it.unirc.pwm.ht.CartaCredito;
import it.unirc.pwm.ht.Cliente;

public interface CartaCreditoDAO {

	public boolean salva(CartaCredito cc, Cliente cl);
	public CartaCredito get(CartaCredito creditCard);
	public CartaCredito getByNumCarta(CartaCredito creditCard);
	public boolean elimina(CartaCredito cc);
	public boolean modifica(CartaCredito cc);
	public Vector<CartaCredito> getAll();
	public Vector<CartaCredito> getAllByCliente(Cliente cliente);
	public boolean hasCartaCredito(int cliente);
	public boolean vincoloCC1(CartaCredito cartaCredito, Cliente cliente);
	public Vector<CartaCredito> carteDelCliente(int cliente);
}
