package it.unirc.pwm.actions.privato.carrello;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.Articolo;
import it.unirc.pwm.ht.Carrello;
import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.dao.ArticoloDAO;
import it.unirc.pwm.ht.join.dao.ArticoloComponeCarrelloDAO;
import it.unirc.pwm.ht.join.dao.ArticoloComponeCarrelloDAOFactory;

import java.util.Map;

import org.apache.struts2.action.SessionAware;

public class RemoveArticle extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 1L;
	private Map<String, Object> session;
    private Articolo articolo;
    private Carrello carrello;

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
        ArticoloComponeCarrelloDAO componeDAO = ArticoloComponeCarrelloDAOFactory.getDAO();
        Articolo a = ArticoloDAO.get(articolo);
        boolean res = componeDAO.elimina(a, carrello);

        return SUCCESS;
    }
}
