package it.unirc.pwm.ht.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pwm.ecommerce.util.HibernateUtil;
import it.unirc.pwm.ht.Categoria;


public class CategoriaDAOHibernateImpl implements CategoriaDAO {

	@Override
	public boolean salva(Categoria Categoria) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean res=false;
		try {
			transaction = session.beginTransaction();
			session.persist(Categoria);
			transaction.commit();
			res = true;
		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return res;
	}

	@Override
	public Categoria get(Categoria Categoria) {
		// TODO Auto-generated method stub
		return null;
	}
	

	

	

	@Override
	public boolean elimina(Categoria Categoria) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifica(Categoria Categoria) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		Categoria result = null;

		try {
			transaction = session.beginTransaction();

			result = session.merge(Categoria);

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
	public List<Categoria> getAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List<Categoria> result = null;

		try {
			transaction = session.beginTransaction();

			String queryHQL = "from Categoria";
			result = session.createQuery(queryHQL, Categoria.class).list();

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
	public Categoria getByNome(Categoria categoria) {
		// TODO Auto-generated method stub
		return null;
	}



	



}
