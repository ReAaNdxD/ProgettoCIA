package it.unirc.pwm.actions;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.dao.ClienteDAO;
import it.unirc.pwm.ht.dao.ClienteDAOFactory;

public class RegistraNuovoCliente extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String execute() {
		ClienteDAO cDAO = ClienteDAOFactory.getDAO();
		if (cDAO.checkEmail(this.cliente.getEmail())) {
			System.out.println("ce email nel db");
			addFieldError("cliente.email", "email già esistente");
			return INPUT;
//			if (cDAO.salva(cliente))
//				return SUCCESS;
//			else {
//				System.out.println("Non ho salvato");
//				addActionError("Non sono riuscito a salvarlo");
//				return ERROR; 
//			}
		}
		if (cDAO.salva(cliente))
			return SUCCESS;
		else {
			System.out.println("Non ho salvato");
			addActionError("Non sono riuscito a salvarlo");
			return ERROR;
		}
	}
	public void validate() {
		if(cliente.getPassword().length()==0)
			this.addFieldError("cliente.password", ERROR);
	}

}
