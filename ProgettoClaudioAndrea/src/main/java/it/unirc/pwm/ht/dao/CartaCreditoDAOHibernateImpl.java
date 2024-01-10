package it.unirc.pwm.ht.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import it.unirc.pwm.ecommerce.util.HibernateUtil;
import it.unirc.pwm.ht.CartaCredito;
import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.IndirizzoSpedizione;
import jakarta.persistence.PersistenceException;

public class CartaCreditoDAOHibernateImpl implements CartaCreditoDAO {

	@Override
	public boolean salva(CartaCredito cc, Cliente cl) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean res = false;
		try {
			transaction = session.beginTransaction();
			cc.getClientes().add(cl);
			session.persist(cc);
			transaction.commit();
			res = true;
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
			return false;
		} catch(PersistenceException pe) {
			transaction.rollback();
			pe.printStackTrace();
			return false;
		}finally {
			if (session != null) // spesso omesso
				session.close();
		}
		return res;
	}

	@Override
	public CartaCredito get(CartaCredito creditCard) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		CartaCredito result = null;
		try {
			transaction = session.beginTransaction();
			String queryHQL = "from CartaCredito where idCartaCredito =?1";
			result = session.createQuery(queryHQL, CartaCredito.class).setParameter(1, creditCard.getIdCartaCredito())
					.getSingleResult();
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			result = null;
		} catch (Exception e) {
			result = null;
		} finally {
			session.close();
		}
		return result;
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
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		CartaCredito result = null;

		try {
			transaction = session.beginTransaction();

			result = session.merge(cc);

			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			System.out.println(e);
//			result = null;
		} finally {
			session.close();
		}
		return result != null;
	}

	@Override
	public List<CartaCredito> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CartaCredito> getAllByCliente(Cliente cliente) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List<CartaCredito> result = null;

		try {
			transaction = session.beginTransaction();

			String queryHQL = "Select cc from CartaCredito cc JOIN cc.clientes c  WHERE c.idCliente=?1";
			Query <CartaCredito> query = session.createQuery(queryHQL, CartaCredito.class);
			query.setParameter(1, cliente.getIdCliente());
			result = query.list();
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
//			result = null;
			System.out.println(e + "sono nel primo catch");
			e.printStackTrace();
		} catch (Exception e) {
//			result = null;
			System.out.println(e + "secondo catch");
			e.printStackTrace();
		} finally {
			session.close();
		}
		return result;
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
	public List<CartaCredito> carteDelCliente(int cliente) {
		// TODO Auto-generated method stub
		return null;
	}

}
