package it.unirc.pwm.actions.privato.indirizzospedizione;

import java.util.Map;

import org.apache.struts2.action.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.actions.ClienteAware;
import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.IndirizzoSpedizione;
import it.unirc.pwm.ht.dao.IndirizzoSpedizioneDAO;
import it.unirc.pwm.ht.dao.IndirizzoSpedizioneDAOFactory;

public class RichiediModificaIndirizzoSpedizione extends ActionSupport implements SessionAware, ClienteAware {
	private static final long serialVersionUID = 1L;
	private IndirizzoSpedizione indirizzo;
	private Map<String, Object> session;
	private Integer id;
	private Cliente cliente;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public IndirizzoSpedizione getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(IndirizzoSpedizione indirizzo) {
		this.indirizzo = indirizzo;
	}

	@Override
	public String execute() {
		System.out.println(id + "sono id");
		IndirizzoSpedizioneDAO iSDAO = IndirizzoSpedizioneDAOFactory.getDAO();
		IndirizzoSpedizione i = iSDAO.getById(id);
		session.put("indirizzo", i);
		System.out.println(i + "sono i");
		return SUCCESS;
	}

	@Override
	public void withSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
		
	}
}
