package it.unirc.pwm.ht.dao;

public class CategoriaDAOFactory {

private static CategoriaDAO dao = null;
	
	public static synchronized CategoriaDAO getDAO() {
	    if ( dao == null ) {
	    	dao = new CategoriaDAOHibernateImpl();
	    }
	    return dao;
	  }
}
