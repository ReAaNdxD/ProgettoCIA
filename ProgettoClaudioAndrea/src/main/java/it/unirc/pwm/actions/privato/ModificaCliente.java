package it.unirc.pwm.actions.privato;
 
import java.util.Map;

import org.apache.struts2.action.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.dao.ClienteDAO;
import it.unirc.pwm.ht.dao.ClienteDAOFactory;
 
public class ModificaCliente extends ActionSupport implements SessionAware {
 
	private static final long serialVersionUID = 1L;
	private Cliente cliente;
	private String ripetiPassword;
	private Map<String, Object> session; 
 
	public Cliente getCliente() {
		return cliente;
	}
 
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

 
	public String getRipetiPassword() {
		return ripetiPassword;
	}

	public void setRipetiPassword(String ripetiPassword) {
		this.ripetiPassword = ripetiPassword;
	}

	public String execute() {
		ClienteDAO cDAO = ClienteDAOFactory.getDAO();
		
		Cliente c =(Cliente)session.get("cliente");
		cliente.setIdCliente(c.getIdCliente());
		System.out.println(cliente);
		if (cDAO.modifica(cliente)) {
			session.replace("cliente", this.cliente);
			return SUCCESS;
		}else {
			addActionError("Esiste già un cliente con la stessa Email");
			return ERROR;
		}
	}
	public void validate() {
		if (!cliente.getPassword().equals(ripetiPassword)) {
			System.out.println(cliente);
            addActionError("Le due password non corrispondono.");
        }
	}
	
	@Override
	public void withSession(Map<String, Object> session) {
		this.session=session;
	}
 
 
}