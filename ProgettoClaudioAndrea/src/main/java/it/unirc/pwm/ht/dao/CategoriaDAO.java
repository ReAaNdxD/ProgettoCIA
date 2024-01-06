package it.unirc.pwm.ht.dao;


import java.util.List;

import it.unirc.pwm.ht.Categoria;


public interface CategoriaDAO {
	public  boolean salva(Categoria categoria);
	public Categoria get(Categoria categoria);
	public Categoria getByNome(Categoria categoria);
	public boolean elimina(Categoria categoria);
	public boolean modifica(Categoria category);
	public List<Categoria> getAll();
	
	
}
