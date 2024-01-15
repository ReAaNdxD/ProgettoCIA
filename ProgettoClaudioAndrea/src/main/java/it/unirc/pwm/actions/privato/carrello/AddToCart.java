package it.unirc.pwm.actions.privato.carrello;

import java.util.List;
import java.util.Map;

import org.apache.struts2.action.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.Articolo;
import it.unirc.pwm.ht.Carrello;
import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.Compone;
import it.unirc.pwm.ht.ComponeId;
import it.unirc.pwm.ht.dao.ArticoloDAO;
import it.unirc.pwm.ht.dao.ArticoloDAOFactory;
import it.unirc.pwm.ht.dao.CarrelloDAO;
import it.unirc.pwm.ht.dao.CarrelloDAOFactory;
import it.unirc.pwm.ht.join.dao.ComponeDAO;
import it.unirc.pwm.ht.join.dao.ComponeDAOFactory;

public class AddToCart extends ActionSupport implements SessionAware {

	private Articolo articolo;
	private Map<String, Object> session;

	public Articolo getArticolo() {
		return articolo;
	}

	public void setArticolo(Articolo articolo) {
		this.articolo = articolo;
	}

	@Override
	public String execute() {
		Cliente cliente = (Cliente) session.get("cliente");
		CarrelloDAO cDAO = CarrelloDAOFactory.getDAO();
		Carrello carrello = cDAO.getCarrelloByCliente(cliente);
		ArticoloDAO aDAO = ArticoloDAOFactory.getDAO();
		ComponeDAO componeDAO = ComponeDAOFactory.getDAO();

		ComponeId cId = new ComponeId(articolo.getIdArticolo(), carrello.getIdCarrello());
		System.out.println(cId);
		Compone c = new Compone(cId, articolo, carrello, articolo.getPrezzo(), 1);
		System.out.println(c);
		if (componeDAO.aggiungiArticoloCarrello(c)) {
			System.out.println("IF");
			System.out.println(articolo.getQuantita());
			articolo.modQuantità();
			System.out.println(articolo.getQuantita());
			boolean res = aDAO.modifica(articolo);
			System.out.println(res);
			return SUCCESS;
		}
		addActionError("Non siamo riusciti ad aggiungere l'articolo nel carrello");
		return ERROR;
	}

	@Override
	public void withSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.session = arg0;
	}

}
