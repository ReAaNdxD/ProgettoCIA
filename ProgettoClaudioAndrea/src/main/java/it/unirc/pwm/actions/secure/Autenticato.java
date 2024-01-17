package it.unirc.pwm.actions.secure;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.actions.privato.utils.ClienteAware;
import it.unirc.pwm.ht.Cliente;

public class Autenticato extends ActionSupport implements ClienteAware, Action {

	private static final long serialVersionUID = 1L;
	private Cliente cliente;
	
	public String execute(){
		return SUCCESS;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente= cliente;
	}
}
