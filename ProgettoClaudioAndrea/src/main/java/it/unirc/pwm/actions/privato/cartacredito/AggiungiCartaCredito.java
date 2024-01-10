package it.unirc.pwm.actions.privato.cartacredito;

import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.CartaCredito;
import it.unirc.pwm.ht.dao.CartaCreditoDAO;
import it.unirc.pwm.ht.dao.CartaCreditoDAOFactory;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.apache.struts2.action.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

public class AggiungiCartaCredito extends ActionSupport implements SessionAware {
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
		System.out.println("SONO EXECUTE");
		CartaCreditoDAO cDAO = CartaCreditoDAOFactory.getDAO();
		Cliente cliente = (Cliente) session.get("cliente");
		System.out.println(cliente);
		System.out.println(carta);
		if (cDAO.salva(carta, cliente)) {
			System.out.println("dentro if");
			CartaCreditoDAO cartaCreditoDAO = CartaCreditoDAOFactory.getDAO();
			List<CartaCredito> carteCredito = cartaCreditoDAO.getAllByCliente(cliente);
			System.out.println(carteCredito);
			session.replace("carteCredito", carteCredito);
			return SUCCESS;
		}
		return ERROR;
	}

	@Override
	public void withSession(Map<String, Object> session) {
		this.session = session;

	}
}
