package it.unirc.pwm.ht.dao;

import java.util.List;

import it.unirc.pwm.ht.Cliente;
import it.unirc.pwm.ht.IndirizzoSpedizione;


public interface IndirizzoSpedizioneDAO {

	
	public IndirizzoSpedizione get(IndirizzoSpedizione is);
	public IndirizzoSpedizione getIndirizzoByCliente(IndirizzoSpedizione is);
	public boolean salva(IndirizzoSpedizione is);
	public boolean nonCiSonoIndirizzi(int idCliente);
	public boolean elimina(IndirizzoSpedizione is);
	public boolean modifica(IndirizzoSpedizione is);
	public List<IndirizzoSpedizione> getAll(Cliente cliente);
	public boolean hasIndirizzi(Cliente cliente);
	public boolean modificaPreferito(IndirizzoSpedizione indirizzo);
	public boolean eliminaPreferito(int idCliente);
	public IndirizzoSpedizione getIndirizzoPreferito(Cliente cl);
	public IndirizzoSpedizione getById(int is);
	
	
	
	}
