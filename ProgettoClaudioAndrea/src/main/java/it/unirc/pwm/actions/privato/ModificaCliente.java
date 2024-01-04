package it.unirc.pwm.actions.privato;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.dao.ClienteDAO;
import it.unirc.pwm.ht.dao.ClienteDAOFactory;

public class ModificaCliente extends ActionSupport {

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
		if (cDAO.modifica(cliente))
			return SUCCESS;
		else {
			addActionError("Esiste già un cliente con la stessa Email");
			return ERROR;
		}
	}


}
