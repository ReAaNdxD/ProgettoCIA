package it.unirc.pwm.actions.privato.articolo;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.actions.ClienteAware;
import it.unirc.pwm.ht.Articolo;
import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.dao.ArticoloDAO;
import it.unirc.pwm.ht.dao.ArticoloDAOFactory;

public class ProductDetails extends ActionSupport implements ClienteAware  {
	private static final long serialVersionUID = 1L;
	private Cliente cliente;
	private Articolo articolo;

	public Articolo getArticolo() {
		return articolo;
	}

	public void setArticolo(Articolo articolo) {
		this.articolo = articolo;
	}

	@Override
	public String execute() {
		ArticoloDAO articoloDAO = ArticoloDAOFactory.getDAO();
		articolo = articoloDAO.get(articolo);
		if (articolo != null) {
			System.out.println("SUCCESS");
			return SUCCESS;
		}

		return ERROR;
	}

	@Override
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;

	}


}
