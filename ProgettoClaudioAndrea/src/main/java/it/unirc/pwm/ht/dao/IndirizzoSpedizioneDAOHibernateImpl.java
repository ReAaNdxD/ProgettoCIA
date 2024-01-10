package it.unirc.pwm.ht.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import it.unirc.pwm.ecommerce.util.HibernateUtil;
import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.IndirizzoSpedizione;
import jakarta.persistence.PersistenceException;

public class IndirizzoSpedizioneDAOHibernateImpl implements IndirizzoSpedizioneDAO {

	@Override
	public IndirizzoSpedizione get(IndirizzoSpedizione is) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IndirizzoSpedizione getIndirizzoByCliente(IndirizzoSpedizione is) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean salva(IndirizzoSpedizione is) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean res = false;
		try {
			transaction = session.beginTransaction();
			session.persist(is);
			transaction.commit();
			res = true;
		} catch (HibernateException e) {
			transaction.rollback();
//			return false;
		} catch(PersistenceException pe) {
			transaction.rollback();
//			return false;
		}
		finally {
			if (session != null) // spesso omesso
				session.close();
		}
		return res;
	}

	@Override
	public boolean nonCiSonoIndirizzi(int idCliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean elimina(IndirizzoSpedizione is) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifica(IndirizzoSpedizione is) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		IndirizzoSpedizione result = null;

		try {
			transaction = session.beginTransaction();

			result = session.merge(is);

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
	public List<IndirizzoSpedizione> getAll(Cliente cliente) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List<IndirizzoSpedizione> result = null;

		try {
			transaction = session.beginTransaction();

			String queryHQL = "from IndirizzoSpedizione WHERE cliente=?1";
			Query <IndirizzoSpedizione> query = session.createQuery(queryHQL, IndirizzoSpedizione.class);
			query.setParameter(1, cliente);
			result = query.list();
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
//			result = null;
			System.out.println(e + "sono nel primo catch");
		} catch (Exception e) {
//			result = null;
			System.out.println(e);

		} finally {
			session.close();
		}

		return result;
	}

	@Override
	public boolean hasIndirizzi(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificaPreferito(IndirizzoSpedizione indirizzo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminaPreferito(int idCliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IndirizzoSpedizione getIndirizzoPreferito(Cliente cl) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IndirizzoSpedizione getById(int is) {
		// TODO Auto-generated method stub
		return null;
	}

}
