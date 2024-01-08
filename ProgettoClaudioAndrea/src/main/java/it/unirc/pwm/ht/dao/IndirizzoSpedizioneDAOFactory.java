package it.unirc.pwm.ht.dao;

public class IndirizzoSpedizioneDAOFactory {
	private static IndirizzoSpedizioneDAO dao = null;

	public static synchronized IndirizzoSpedizioneDAO getDAO() {
		if ( dao == null ) {
			dao = new IndirizzoSpedizioneDAOHibernateImpl();
		}
		return dao;
	}

}
