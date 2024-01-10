package it.unirc.pwm.actions.privato.indirizzospedizione;

import java.util.List;
import java.util.Map;

import org.apache.struts2.action.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.IndirizzoSpedizione;
import it.unirc.pwm.ht.dao.IndirizzoSpedizioneDAO;
import it.unirc.pwm.ht.dao.IndirizzoSpedizioneDAOFactory;

public class ModificaIndirizzoSpedizione extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 1L;
	private IndirizzoSpedizione indirizzo;
	private Map<String, Object> session;

	public IndirizzoSpedizione getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(IndirizzoSpedizione indirizzo) {
		this.indirizzo = indirizzo;
	}

	@Override
	public String execute() {
		if (indirizzo != null) {
			Cliente cliente = (Cliente) session.get("cliente");
			IndirizzoSpedizione is = ((IndirizzoSpedizione) session.get("indirizzo"));
			indirizzo.setIdIndirizzoSpedizione(is.getIdIndirizzoSpedizione());
			indirizzo.setCliente(cliente);
			System.out.println(indirizzo);
			IndirizzoSpedizioneDAO iSDAO = IndirizzoSpedizioneDAOFactory.getDAO();
			iSDAO.modifica(indirizzo);
			IndirizzoSpedizioneDAO indirizzoSpedizioneDAO = IndirizzoSpedizioneDAOFactory.getDAO();
	        List<IndirizzoSpedizione> indirizzi = indirizzoSpedizioneDAO.getAll(cliente);
	        session.replace("indirizziSpedizione", indirizzi);
	        return SUCCESS;
		} else {
			addActionError("Indirizzo nullo");
			return ERROR;
		}
	}

	@Override
	public void withSession(Map<String, Object> session) {
		this.session = session;
	}
}



//System.out.println(indirizzo);
//IndirizzoSpedizione indirizzo = (IndirizzoSpedizione) session.get("indirizzo");
//if (indirizzo != null) {
//    indirizzo.setCliente((Cliente)session.get("cliente"));
//
//
//	IndirizzoSpedizioneDAO iSDAO = IndirizzoSpedizioneDAOFactory.getDAO();
//	iSDAO.modifica(indirizzo);
//
//	System.out.println(indirizzo);
//	
//
//	session.put("indirizzo", indirizzo);
//
//	return SUCCESS;
//} else {
//	addActionError("Operazione fallita");
//	return ERROR;
//}
