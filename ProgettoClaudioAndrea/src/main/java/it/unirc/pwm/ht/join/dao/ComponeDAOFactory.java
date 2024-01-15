package it.unirc.pwm.ht.join.dao;

public class ComponeDAOFactory {

private static ComponeDAO dao = null;
	
	public static synchronized ComponeDAO getDAO() {
	    if ( dao == null ) {
	    	dao = new ComponeDAOHibernateImpl();
	    }
	    return dao;
	  }
}
