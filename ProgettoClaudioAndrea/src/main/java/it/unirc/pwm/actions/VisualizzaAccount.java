package it.unirc.pwm.actions;

import java.util.Map;

import org.apache.struts2.action.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.Cliente;

public class VisualizzaAccount extends ActionSupport implements SessionAware, ClienteAware {
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
//		if((Cliente)session.get("cliente")!=null) {
//			return SUCCESS;
//		}else
//			return ERROR;	
		return SUCCESS;
	}


	@Override
	public void withSession(Map<String, Object> session) {
		this.session=session;
	}

}
