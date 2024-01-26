package it.unirc.pwm.actions.privato.cartacredito;

import java.util.Map;

import org.apache.struts2.action.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.actions.ClienteAware;
import it.unirc.pwm.ht.CartaCredito;
import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.dao.CartaCreditoDAO;
import it.unirc.pwm.ht.dao.CartaCreditoDAOFactory;

public class RichiediModificaCartaCredito extends ActionSupport implements SessionAware, ClienteAware {
	private static final long serialVersionUID = 1L;
	private Map<String, Object> session;
	private Integer id;
	private Cliente cliente;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	@Override
	public String execute() {
		CartaCreditoDAO cDAO = CartaCreditoDAOFactory.getDAO();
		CartaCredito cc = new CartaCredito();
		cc.setIdCartaCredito(id);
		CartaCredito c = cDAO.get(cc);
		if (c!= null) {
		session.put("carta", c);
		return SUCCESS;
		}return ERROR;
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
