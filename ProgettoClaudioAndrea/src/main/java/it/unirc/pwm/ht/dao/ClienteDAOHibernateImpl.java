package it.unirc.pwm.ht.dao;

import java.sql.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import it.unirc.pwm.ecommerce.util.HibernateUtil;

import it.unirc.db.ecommerce.views.Customer;
import it.unirc.pwm.ht.Carrello;
import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.Ordine;

public class ClienteDAOHibernateImpl implements ClienteDAO {
	static private Logger logger = LogManager.getLogger("Logger");
	protected ClienteDAOHibernateImpl() {
	}

	@Override
	public boolean salva(Cliente cliente) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean res = false;
		try {
			transaction = session.beginTransaction();
			session.persist(cliente);
			transaction.commit();
			res = true;
		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			if (session != null) // spesso omesso
				session.close();
		}
		return res;
	}

	@Override
	public Cliente get(Cliente customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente getByNotId(Cliente customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente getIdByEmail(Cliente customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente getIdByCarrello(Carrello carrello) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean elimina(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifica(Cliente cliente) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		Cliente result = null;

		try {
			transaction = session.beginTransaction();

			result = session.merge(cliente);

			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			result = null;
		} finally {
			session.close();
		}
		return result != null;
	}

	@Override
	public List<Cliente> getAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List<Cliente> result = null;

		try {
			transaction = session.beginTransaction();

			String queryHQL = "from cliente";
			result = session.createQuery(queryHQL, Cliente.class).list();

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
	public List<Cliente> getAllClientiNonPrime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean disdiciPrime1(Cliente cl) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean assegnaCarrello(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Cliente> cercaClienteById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> cercaClienteByNome_Email(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> clientiMaxAcquisti() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente ordineEffettuatoDa(Ordine ordine) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean checkEmail(String email) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
//		Cliente c = new Cliente();
		try {
			transaction = session.beginTransaction();
			System.out.println(email);
//			List<Studente> l=session.createQuery("from Studente where nome=?1",Studente.class).setParameter(1, "Mario").list();
//			Studente s=session.createQuery("from Studente",Studente.class).setMaxResults(1).uniqueResult(); 
			Cliente c=session.createQuery("FROM Account WHERE email =?1",Cliente.class).setMaxResults(1).uniqueResult(); 
//			List<Cliente> c = session.createQuery("FROM Account WHERE email =?1",Cliente.class).setParameter(1, email).list();
//			q.setParameter(1, email);
//			c = q.getSingleResult();
			logger.info(c);
			System.out.println(c);
			if(c!= null)
				return true;
			transaction.commit();
			}catch (Exception e) {
				transaction.rollback();
				return true;
//				e.getStackTrace();
			} 
			finally {
					session.close();
			}
			return false;
	}

	@Override
	public boolean checkEmailForUpdate(String email, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Date disdiciPrime(Date dataInizio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer login(String email, String password) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		Integer result = null;

		try {
			transaction = session.beginTransaction();

			String queryHQL = "select idCliente from cliente where email =? and password=?";
			result = session.createQuery(queryHQL, Integer.class).setParameter("email", email)
					.setParameter("password", password).getSingleResult();

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

}
