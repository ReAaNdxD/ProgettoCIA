package it.unirc.pwm.ht.dao;

public class CartaCreditoDAOFactory {
private static CartaCreditoDAO dao = null;
	
	public static synchronized CartaCreditoDAO getDAO() {
	    if ( dao == null ) {
	    	dao = new CartaCreditoDAOHibernateImpl();
	    }
	    return dao;
	  }
}
