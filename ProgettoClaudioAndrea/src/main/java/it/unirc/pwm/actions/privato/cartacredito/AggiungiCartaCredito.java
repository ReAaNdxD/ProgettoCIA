package it.unirc.pwm.actions.privato.cartacredito;

import java.util.List;
import java.util.Map;

import org.apache.struts2.action.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.actions.ClienteAware;
import it.unirc.pwm.ht.CartaCredito;
import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.dao.CartaCreditoDAO;
import it.unirc.pwm.ht.dao.CartaCreditoDAOFactory;

public class AggiungiCartaCredito extends ActionSupport implements SessionAware, ClienteAware {
	private static final long serialVersionUID = 1L;
	private CartaCredito carta;
	private Map<String, Object> session;
	private Cliente cliente;

	public CartaCredito getCarta() {
		return carta;
	}

	public void setCarta(CartaCredito carta) {
		this.carta = carta;
	}

	@Override
	public String execute() {
		CartaCreditoDAO cDAO = CartaCreditoDAOFactory.getDAO();
		Cliente cliente = (Cliente) session.get("cliente");
		if (cDAO.salva(carta, cliente)) {
			CartaCreditoDAO cartaCreditoDAO = CartaCreditoDAOFactory.getDAO();
			List<CartaCredito> carteCredito = cartaCreditoDAO.getAllByCliente(cliente);
			session.replace("carteCredito", carteCredito);
			return SUCCESS;
		}
		return ERROR;
	}
	
	

	@Override
	public void withSession(Map<String, Object> session) {
		this.session = session;

	}

	@Override
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
		
	}
}
