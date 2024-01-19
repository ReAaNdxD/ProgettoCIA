package it.unirc.pwm.actions;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.action.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.dao.ClienteDAO;
import it.unirc.pwm.ht.dao.ClienteDAOFactory;

public class ClienteJSON extends ActionSupport  {
	private static final long serialVersionUID = 1L;

	private Integer idCliente;
	private String nome;
	private String email;
	private String password;
	private String cognome;
	
	private ArrayList<ClienteJSON> cliente;
	
	

	public ArrayList<ClienteJSON> getCliente() {
		return cliente;
	}
	public void setCliente(ArrayList<ClienteJSON> cliente) {
		this.cliente = cliente;
	}
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
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
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
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
