package it.unirc.pwm.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.dao.ClienteDAO;
import it.unirc.pwm.ht.dao.ClienteDAOFactory;

public class RegistraNuovoCliente extends ActionSupport implements ModelDriven<Cliente> {

	private static final long serialVersionUID = 1L;
	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public RegistraNuovoCliente() {
		cliente=new Cliente();
	}
	
	@Override
	public Cliente getModel() {
		return cliente;
	}

	public String execute() {
		ClienteDAO cDAO = ClienteDAOFactory.getDAO();
		if (cDAO.salva(cliente))
			return SUCCESS;
		else {
			addActionError("Esiste già un cliente con la stessa Email");
			return ERROR;
		}
	}


	

}
