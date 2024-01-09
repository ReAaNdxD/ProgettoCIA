package it.unirc.pwm.ht.dao;

import java.util.Vector;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pwm.ecommerce.util.HibernateUtil;
import it.unirc.pwm.ht.CartaCredito;
import it.unirc.pwm.ht.Cliente;
import jakarta.persistence.PersistenceException;

public class CartaCreditoDAOHibernateImpl implements CartaCreditoDAO {

	@Override
	public boolean salva(CartaCredito cc, Cliente cl) {
		return false;
	}

	@Override
	public CartaCredito get(CartaCredito creditCard) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartaCredito getByNumCarta(CartaCredito creditCard) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean elimina(CartaCredito cc) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifica(CartaCredito cc) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Vector<CartaCredito> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<CartaCredito> getAllByCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasCartaCredito(int cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean vincoloCC1(CartaCredito cartaCredito, Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Vector<CartaCredito> carteDelCliente(int cliente) {
		// TODO Auto-generated method stub
		return null;
	}

}
