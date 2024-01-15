package it.unirc.pwm.ht.join.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pwm.ecommerce.util.HibernateUtil;
import it.unirc.pwm.ht.Articolo;
import it.unirc.pwm.ht.Carrello;
import it.unirc.pwm.ht.Compone;

public class ComponeDAOHibernateImpl implements ComponeDAO {


	public boolean aggiungiArticoloCarrello(Articolo articolo, Carrello carrello, int quantita) {
		return false;		
	}

	public boolean modifica(Articolo articolo, Carrello carrello, int quantita) {
		return false;

		
	}
	
	@Override
	public Compone get(Articolo a, Carrello c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		Compone result = null;
		try {
			transaction = session.beginTransaction();
			String queryHQL = "from Compone where articolo =?1 and carrello=?2";
			result = session.createQuery(queryHQL, Compone.class).setParameter(1, a)
					.setParameter(2, c).getSingleResult();
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
			result = null;
		} catch (Exception e) {
			e.printStackTrace();
			result = null;
		} finally {
			session.close();
		}
		return result;
	}

	public boolean elimina(Compone c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean res = false;
		

		try {
			
            transaction = session.beginTransaction();
            
            session.remove(c);
            res=true;
            transaction.commit();

			
		} catch (Exception e) {
			e.printStackTrace();
			res = false;
		} finally {
			session.close();
		}
		return res;
	}

	public List<Compone> articoliCarrello(Carrello c) {
		return null;

	}

	public boolean isArticoloInCarrello(Articolo articolo, Carrello carrello) {
		return false;
	}

	public boolean prova(Carrello carrello, Articolo articolo) {
		return false;

	}

	public boolean aggiornaQuantita(Articolo articolo, Carrello carrello, int quantita) {
		return false;
	}

	public boolean aggiornaPrezzo(Articolo articolo, Carrello carrello) {
		return false;
	}
	
	public double calcoloCosto(Carrello carrello) {
		return 0;
	}
}


