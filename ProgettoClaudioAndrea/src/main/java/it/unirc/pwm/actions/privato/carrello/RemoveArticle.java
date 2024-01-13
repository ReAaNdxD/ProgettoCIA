package it.unirc.pwm.actions.privato.carrello;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.Articolo;
import it.unirc.pwm.ht.Carrello;
import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.dao.ArticoloDAO;
import it.unirc.pwm.ht.dao.ArticoloDAOFactory;
import it.unirc.pwm.ht.dao.CarrelloDAO;
import it.unirc.pwm.ht.dao.CarrelloDAOFactory;
import it.unirc.pwm.ht.join.dao.ArticoloComponeCarrelloDAO;
import it.unirc.pwm.ht.join.dao.ArticoloComponeCarrelloDAOFactory;

import java.util.List;
import java.util.Map;

import org.apache.struts2.action.SessionAware;

public class RemoveArticle extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 1L;
	private Map<String, Object> session;
    private Articolo articolo;
    private Carrello carrello;
	private Integer id;

    public Carrello getCarrello() {
		return carrello;
	}

	public void setCarrello(Carrello carrello) {
		this.carrello = carrello;
	}

    public Articolo getArticolo() {
		return articolo;
	}

	public void setArticolo(Articolo articolo) {
		this.articolo = articolo;
	}

	@Override
    public void withSession(Map<String, Object> session) {
        this.session = session;
    }

    @Override
    public String execute() {
    	Cliente cliente = (Cliente) session.get("cliente");
    	Articolo aId = new Articolo();
    	aId.setIdArticolo(id);
    	CarrelloDAO cDAO = CarrelloDAOFactory.getDAO();
    	Carrello carrello = cDAO.getCarrelloByCliente(cliente);
        ArticoloDAO aDAO = ArticoloDAOFactory.getDAO();
        ArticoloComponeCarrelloDAO componeDAO = ArticoloComponeCarrelloDAOFactory.getDAO();
        boolean res = componeDAO.elimina(aId, carrello);
        if (res) {
        	List<Articolo> listaArticoli = aDAO.getArticoli(carrello);
	    	session.replace("listaArticoli", listaArticoli);
	    	System.out.println("Sono dentro l'if");
        	return SUCCESS;
        }else
        	System.out.println("Sono dentro l'errore");
        	addActionError("Non siamo riusciti ad eliminare l'articolo dal carrello");
        	return ERROR;
    }
}
