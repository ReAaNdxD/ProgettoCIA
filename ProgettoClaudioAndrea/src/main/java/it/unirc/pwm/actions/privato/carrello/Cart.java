	package it.unirc.pwm.actions.privato.carrello;
	
	import java.util.List;
import java.util.Map;

import org.apache.struts2.action.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import it.unirc.pwm.ht.Articolo;
import it.unirc.pwm.ht.Carrello;
import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.dao.CarrelloDAO;
import it.unirc.pwm.ht.dao.CarrelloDAOFactory;
	
	public class Cart extends ActionSupport implements ModelDriven<Carrello>,SessionAware {
		private static final long serialVersionUID = 1L;
		private Carrello carrello;
		private Map<String, Object> session; 
	
	    @Override
	    public Carrello getModel() {
	        return carrello;
	    }
	
	    public String execute() {
	    	Cliente cliente = (Cliente) session.get("cliente");
	    	CarrelloDAO cDAO = CarrelloDAOFactory.getDAO();
	    	Carrello carrelloCliente = cDAO.getCarrelloByCliente(cliente);
	    	List<Articolo> listaArticoli = cDAO.getArticoli(carrelloCliente);
	    	System.out.println(cliente);
	    	System.out.println(carrelloCliente);
	    	System.out.println(listaArticoli);
	    	
	    	session.put("listaArticoli", listaArticoli);
	        return SUCCESS;
	    }
	
		public Carrello getCarrello() {
			return carrello;
		}

		public void setCarrello(Carrello carrello) {
			this.carrello = carrello;
		}

		@Override
		public void withSession(Map<String, Object> session) {
			this.session = session;
			
		}
	}
