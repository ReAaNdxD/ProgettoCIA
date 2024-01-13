package it.unirc.pwm.ht.join.dao;

import java.util.Vector;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import it.unirc.db.ecommerce.views.Compone;
import it.unirc.pwm.ecommerce.util.HibernateUtil;
import it.unirc.pwm.ht.Articolo;
import it.unirc.pwm.ht.Carrello;

public class ArticoloComponeCarrelloDAOHibernateImpl implements ArticoloComponeCarrelloDAO {

//	private static Connection conn;

//	private Compone recordToCompone(ResultSet rs) throws SQLException {
//		Compone vectorCompone = new Compone();
//		vectorCompone.setIdArticolo(rs.getInt("idArticolo"));
//		vectorCompone.setPrezzoAcquisto(rs.getFloat("prezzoAcquisto"));
//		vectorCompone.setquantita(rs.getInt("quantita"));
//		return vectorCompone;
//	}

	public boolean aggiungiArticoloCarrello(Articolo articolo, Carrello carrello, int quantita) {
		return false;		
	}

	public boolean modifica(Articolo articolo, Carrello carrello, int quantita) {
		return false;

	}

	public boolean elimina(Articolo articolo, Carrello carrello) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			String queryHQL ="delete FROM Compone c WHERE c.articolo.idArticolo =?1 AND c.carrello.idCarrello =?2";
			Query query = session.createQuery(queryHQL);
			query.setParameter(1, articolo.getIdArticolo());
			query.setParameter(2, carrello.getIdCarrello());
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			session.close();
		}
	}

	public Vector<Compone> articoliCarrello(Carrello c) {
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


