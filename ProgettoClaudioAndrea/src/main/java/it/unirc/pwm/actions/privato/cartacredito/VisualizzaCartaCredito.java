package it.unirc.pwm.actions.privato.cartacredito;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.apache.struts2.action.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.CartaCredito;
import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.dao.CartaCreditoDAO;
import it.unirc.pwm.ht.dao.CartaCreditoDAOFactory;

public class VisualizzaCartaCredito extends ActionSupport implements SessionAware {

	  private static final long serialVersionUID = 1L;
	    private List<CartaCredito> carteCredito;
	    private Map<String, Object> session;
	    
	    
	public String execute() {
		Cliente cliente = (Cliente) session.get("cliente");
		System.out.println(cliente);
        CartaCreditoDAO cartaCreditoDAO = CartaCreditoDAOFactory.getDAO();
        carteCredito = cartaCreditoDAO.getAllByCliente(cliente);
        System.out.println(carteCredito);
        session.put("carteCredito", carteCredito);
       
		return SUCCESS;
	}

	@Override
	public void withSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}
}
