package it.unirc.pwm.actions;

import java.util.Map;

import org.apache.struts2.action.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.dao.ClienteDAO;
import it.unirc.pwm.ht.dao.ClienteDAOFactory;

public class LoginCliente extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 1L;
	private Map<String, Object> session; 

	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String execute() {
		ClienteDAO cDAO = ClienteDAOFactory.getDAO();
		Cliente c = cDAO.login(cliente.getEmail(), cliente.getPassword());
		System.out.println(c);
		System.out.println(cliente.getEmail());
		System.out.println(cliente.getPassword());
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
	@Override
	public void validate() {
		if (cliente.getEmail().length() == 0) {
			this.addFieldError("cliente.email", "Il campo email è obbligatorio");
		}
 
		if (cliente.getPassword().length() == 0) {
			this.addFieldError("cliente.password", "Il campo Password è obbligatorio");
		}
	}

	@Override
	public void withSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session=session;
	}

}
