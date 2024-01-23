package it.unirc.pwm.actions.privato.articolo;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.Articolo;
import it.unirc.pwm.ht.dao.ArticoloDAO;
import it.unirc.pwm.ht.dao.ArticoloDAOFactory;

public class SearchJSON extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private ArrayList<Articolo> articoloList;

	public ArrayList<Articolo> getArticoloList() {
		return articoloList;
	}

	public void setArticoloList(ArrayList<Articolo> articoloList) {
		this.articoloList = articoloList;
	}

	@Override
	public String execute() {
		ArticoloDAO articoloDAO = ArticoloDAOFactory.getDAO();
		articoloList = articoloDAO.visualizzaArticoliJSON();
		System.out.println(articoloList);
		return SUCCESS;
	}

	
	
}
