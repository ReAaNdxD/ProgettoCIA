package it.unirc.pwm.actions.privato.indirizzospedizione;

import java.util.Map;

import org.apache.struts2.action.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.actions.ClienteAware;
import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.IndirizzoSpedizione;
import it.unirc.pwm.ht.dao.IndirizzoSpedizioneDAO;
import it.unirc.pwm.ht.dao.IndirizzoSpedizioneDAOFactory;

public class AggiungiIndirizzoSpedizione extends ActionSupport implements SessionAware, ClienteAware {
	private static final long serialVersionUID = 1L;
	private IndirizzoSpedizione indirizzo;
	private Map<String, Object> session;
	private Cliente cliente;

	public IndirizzoSpedizione getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(IndirizzoSpedizione indirizzo) {
		this.indirizzo = indirizzo;
	}

	@Override
	public String execute() {
		IndirizzoSpedizioneDAO iSDAO = IndirizzoSpedizioneDAOFactory.getDAO();
		cliente = (Cliente) session.get("cliente");
		indirizzo.setCliente(cliente);
		if(iSDAO.salva(indirizzo)) {
			session.replace("indirizziSpedizione", iSDAO.getAll(cliente));
			return SUCCESS;
		}else {
			addActionError("Errore nel salvataggio");
			return ERROR;
		}
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