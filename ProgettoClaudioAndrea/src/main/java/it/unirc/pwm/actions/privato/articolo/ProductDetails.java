package it.unirc.pwm.actions.privato.articolo;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.apache.struts2.action.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.dao.ArticoloDAO;
import it.unirc.pwm.ht.Articolo;
import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.dao.ArticoloDAOFactory;

public class ProductDetails extends ActionSupport  {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Articolo articolo;

	public Articolo getArticolo() {
		return articolo;
	}

	public void setArticolo(Articolo articolo) {
		this.articolo = articolo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	@Override
	public String execute() {
		ArticoloDAO articoloDAO = ArticoloDAOFactory.getDAO();
		System.out.println(id);
		System.out.println("ciao");
		articolo = articoloDAO.get(new Articolo(id));
		System.out.println(articolo);
		if (articolo != null) {
			System.out.println("SUCCESS");
			return SUCCESS;
		}

		return ERROR;
	}

	
}