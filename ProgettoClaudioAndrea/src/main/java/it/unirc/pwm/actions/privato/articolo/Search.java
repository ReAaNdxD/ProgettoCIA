package it.unirc.pwm.actions.privato.articolo;

import java.util.List;
import java.util.Map;

import org.apache.struts2.action.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.actions.ClienteAware;
import it.unirc.pwm.ht.Articolo;
import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.dao.ArticoloDAO;
import it.unirc.pwm.ht.dao.ArticoloDAOFactory;

public class Search extends ActionSupport implements SessionAware, ClienteAware {
	private static final long serialVersionUID = 1L;
	private Map<String, Object> session;
	private Cliente cliente;



	

	@Override
	public String execute() {
		ArticoloDAO articoloDAO = ArticoloDAOFactory.getDAO();
		List<Articolo> articoli = articoloDAO.visualizzaArticoli();
		if(articoli == null) {
			return ERROR;
		}
		session.put("articoli", articoli);
		return SUCCESS;
	}





	@Override
	public void withSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		session = arg0;
	}





	@Override
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
		
	}



	
	
}
