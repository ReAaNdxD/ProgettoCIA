package it.unirc.pwm.actions.privato.indirizzospedizione;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.apache.struts2.action.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.IndirizzoSpedizione;
import it.unirc.pwm.ht.dao.IndirizzoSpedizioneDAO;
import it.unirc.pwm.ht.dao.IndirizzoSpedizioneDAOFactory;

public class VisualizzaIndirizzoSpedizione extends ActionSupport implements SessionAware {
    private static final long serialVersionUID = 1L;
    private Vector<IndirizzoSpedizione> indirizzi;
    private Map<String, Object> session;

    public Vector<IndirizzoSpedizione> getIndirizzi() {
        return indirizzi;
    }

    public void setIndirizzi(Vector<IndirizzoSpedizione> indirizzi) {
        this.indirizzi = indirizzi;
    }

    @Override
    public String execute() {
    	Cliente cliente = (Cliente) session.get("cliente");
        IndirizzoSpedizioneDAO indirizzoSpedizioneDAO = IndirizzoSpedizioneDAOFactory.getDAO();
        List<IndirizzoSpedizione> indirizzi = indirizzoSpedizioneDAO.getAll(cliente);
        session.put("indirizziSpedizione", indirizzi);
        
        return SUCCESS;
    }


	@Override
	public void withSession(Map<String, Object> session) {
		this.session=session;
		
	}
}
