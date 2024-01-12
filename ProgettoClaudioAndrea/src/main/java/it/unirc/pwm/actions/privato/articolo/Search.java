package it.unirc.pwm.actions.privato.articolo;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.apache.struts2.action.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import it.unirc.pwm.ht.dao.ArticoloDAO;
import it.unirc.db.ecommerce.views.GridProduct;
import it.unirc.db.ecommerce.views.ViewProduct;
import it.unirc.pwm.ht.Articolo;
import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.dao.ArticoloDAOFactory;

public class Search extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 1L;
	private Map<String, Object> session;



	

	@Override
	public String execute() {
		int recordsPerPage = 6;
		ArticoloDAO articoloDAO = ArticoloDAOFactory.getDAO();
		List<Articolo> articoli = articoloDAO.visualizzaArticoli();
		System.out.println(articoli);
		if(articoli == null) {
			System.out.println("ERRORE");
			return ERROR;
		}
		session.put("articoli", articoli);
		return SUCCESS;
	}





	@Override
	public void withSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		session = arg0;
	}



	
	
}
