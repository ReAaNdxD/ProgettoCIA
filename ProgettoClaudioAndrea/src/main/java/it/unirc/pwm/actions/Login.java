package it.unirc.pwm.actions;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.dao.ClienteDAOHibernateImpl;
import org.apache.struts2.action.SessionAware;


public class Login extends ActionSupport implements SessionAware {

    private static final long serialVersionUID = 1L;
    private Cliente cliente;
    private ClienteDAOHibernateImpl cDAO;
    private Map<String, Object> session;

    
    @Override
    public void withSession(Map<String, Object> session) {
		this.session = session;
	}
    
    
    public String execute() {
    	if (session.containsKey("cliente")) {
            return SUCCESS;
        }
    	Cliente c = cDAO.login(cliente.getEmail(), cliente.getPassword());
        if (c != null) {
        	session.put("cliente", c);
        	this.cliente = c;
            return SUCCESS;
        } else {
            addActionError("Credenziali non valide");
            return ERROR;
        }
    }

    public void validate() {
        if (cliente.getEmail() == null) {
            addFieldError("email", "Il campo email è obbligatorio");
        }

        if (cliente.getPassword() == null) {
            addFieldError("password", "Il campo Password è obbligatorio");
        }
    }
}

