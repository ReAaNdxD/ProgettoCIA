package it.unirc.pwm.actions;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.dao.ClienteDAO;
import it.unirc.pwm.ht.dao.ClienteDAOFactory;

public class ClienteJSON extends ActionSupport  {
	private static final long serialVersionUID = 1L;
	private String email;
	private String password;
	
	private Cliente cliente;
	
	
	

	
	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}





	public Cliente getCliente() {
		return cliente;
	}





	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}





	public String execute() {
		ClienteDAO cDAO = ClienteDAOFactory.getDAO();
		Cliente cliente = new Cliente();
		cliente.setEmail(email);
		cliente.setPassword(password);
		this.cliente=cDAO.loginJSON(cliente);
		return "SUCCESS";
	}


}
