package it.unirc.pwm.actions.privato.articolo;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.Articolo;
import it.unirc.pwm.ht.dao.ArticoloDAO;
import it.unirc.pwm.ht.dao.ArticoloDAOFactory;

public class ArticoloJSON extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private ArrayList<Articolo> result;

	public ArrayList<Articolo> getArticoloList() {
		return result;
	}

	public void setArticoloList(ArrayList<Articolo> result) {
		this.result = result;
	}

	@Override
	public String execute() {
		ArticoloDAO articoloDAO = ArticoloDAOFactory.getDAO();
		result = articoloDAO.visualizzaArticoliJSON();
		return SUCCESS;
	}

	
	
}
