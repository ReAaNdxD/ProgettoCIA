package it.unirc.pwm.ht.join.dao;

public class ArticoloComponeCarrelloDAOFactory {

private static ArticoloComponeCarrelloDAO dao = null;
	
	public static synchronized ArticoloComponeCarrelloDAO getDAO() {
	    if ( dao == null ) {
	    	dao = new ArticoloComponeCarrelloDAOHibernateImpl();
	    }
	    return dao;
	  }
}
