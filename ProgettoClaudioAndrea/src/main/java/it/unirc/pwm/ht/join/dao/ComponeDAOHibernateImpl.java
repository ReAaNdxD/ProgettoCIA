package it.unirc.pwm.ht.join.dao;

import java.util.List;
import java.util.Vector;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import it.unirc.pwm.ht.Compone;
import it.unirc.pwm.ecommerce.util.HibernateUtil;
import it.unirc.pwm.ht.Articolo;
import it.unirc.pwm.ht.Carrello;

public class ComponeDAOHibernateImpl implements ComponeDAO {


	public boolean aggiungiArticoloCarrello(Articolo articolo, Carrello carrello, int quantita) {
		return false;		
	}

	public boolean modifica(Articolo articolo, Carrello carrello, int quantita) {
		return false;

	}

	public boolean elimina(Articolo articolo, Carrello carrello) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean res = false;
		

		try {
			
            transaction = session.beginTransaction();
            String hql = "delete from Compone c where c.articolo=?1 AND c.carrello=?2";
            Query query = session.createQuery(hql);
            query.setParameter(1, articolo);
            query.setParameter(2, carrello);
            res = true;
            transaction.commit();

			
		} catch (Exception e) {
			e.printStackTrace();
			res = false;
		} finally {
			session.close();
		}
		return res;
	}

	public List<it.unirc.db.ecommerce.views.Compone> articoliCarrello(Carrello c) {
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


