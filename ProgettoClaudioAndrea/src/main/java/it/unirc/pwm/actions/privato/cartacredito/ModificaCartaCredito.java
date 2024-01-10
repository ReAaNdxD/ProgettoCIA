package it.unirc.pwm.actions.privato.cartacredito;

import java.util.List;
import java.util.Map;

import org.apache.struts2.action.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.CartaCredito;
import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.CartaCredito;
import it.unirc.pwm.ht.dao.CartaCreditoDAO;
import it.unirc.pwm.ht.dao.CartaCreditoDAOFactory;

public class ModificaCartaCredito extends ActionSupport implements SessionAware{
	private static final long serialVersionUID = 1L;
	private CartaCredito carta;
	private Map<String, Object> session;
	
	public CartaCredito getCarta() {
		return carta;
	}

	public void setCarta(CartaCredito carta) {
		this.carta = carta;
	}

	@Override
	public String execute() {
		if (carta != null) {
			Cliente cliente = (Cliente) session.get("cliente");
			CartaCredito c = ((CartaCredito) session.get("carta"));
			carta.setIdCartaCredito(c.getIdCartaCredito());
			carta.getClientes().add(cliente);
			System.out.println(carta);
			CartaCreditoDAO cDAO = CartaCreditoDAOFactory.getDAO();
			cDAO.modifica(carta);
	        List<CartaCredito> carte = cDAO.getAllByCliente(cliente);
	        session.replace("carteCredito", carte);
	        return SUCCESS;
		} else {
			addActionError("Non sono riuscito a modificare");
			return ERROR;
		}
	}

	
	@Override
	public void withSession(Map<String, Object> session) {
		this.session = session;

	}
	
}
