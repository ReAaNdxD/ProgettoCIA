package it.unirc.pwm.actions;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.dao.ClienteDAO;
import it.unirc.pwm.ht.dao.ClienteDAOFactory;
import org.apache.struts2.action.SessionAware;

public class Login extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	private Cliente cliente;
	private Map<String, Object> session;

	

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String execute() {
//    	if (session.containsKey("cliente")) {
//    		System.out.println("sono qui");
//            return SUCCESS;
//        }
		ClienteDAO cDAO = ClienteDAOFactory.getDAO();
		Cliente c = cDAO.login(cliente.getEmail(), cliente.getPassword());
		System.out.println(c);
		if (c != null) {
			this.cliente = c;
			session.put("cliente", this.cliente);
			System.out.println(c);
			System.out.println(cliente);
			return SUCCESS;
		} else {
			addActionError("Credenziali non valide");
			return ERROR;
		}
	}

	public void validate() {
		if (cliente.getEmail() == null) {
			addFieldError("email", "Il campo email è obbligatorio");
		}

		if (cliente.getPassword() == null) {
			addFieldError("password", "Il campo Password è obbligatorio");
		}
	}

	@Override
	public void withSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}
}
