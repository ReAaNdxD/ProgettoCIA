package it.unirc.pwm.actions.privato.carrello;

import java.util.List;
import java.util.Map;

import org.apache.struts2.action.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.actions.ClienteAware;
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

public class AddToCart extends ActionSupport implements SessionAware, ClienteAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Articolo articolo;
	private Map<String, Object> session;
	private Cliente cliente;

	public Articolo getArticolo() {
		return articolo;
	}

	public void setArticolo(Articolo articolo) {
		this.articolo = articolo;
	}

	@Override
	public String execute() {
		System.out.println("ADDTOCART");
		Cliente cliente = (Cliente) session.get("cliente");
		CarrelloDAO cDAO = CarrelloDAOFactory.getDAO();
		Carrello carrello = cDAO.getCarrelloByCliente(cliente);
		ArticoloDAO aDAO = ArticoloDAOFactory.getDAO();
		ComponeDAO componeDAO = ComponeDAOFactory.getDAO();
		System.out.println(articolo.getIdArticolo());
		articolo = aDAO.get(articolo);
		System.out.println(articolo);
		ComponeId cId = new ComponeId(articolo.getIdArticolo(), carrello.getIdCarrello());
		System.out.println(cId);
		Compone c = new Compone(cId, articolo, carrello, articolo.getPrezzo(), 1);
		System.out.println(c);
		if (componeDAO.aggiungiArticoloCarrello(c)) {
			System.out.println("SALVA IF");
			System.out.println(articolo.getQuantita());
			articolo.modQuantità();
			System.out.println(articolo.getQuantita());
			boolean res = aDAO.modifica(articolo);
			System.out.println(res);
			List<Articolo> listaArticoli = aDAO.getArticoli(carrello);
			session.put("listaArticoli", listaArticoli);
			return SUCCESS;
		}
		System.out.println("Non l'ha salvato");
		addActionError("L'articolo selezionato è già presente nel carrello");
		return ERROR;
	}

	@Override
	public void withSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.session = arg0;
	}

	@Override
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
		
	}

}
