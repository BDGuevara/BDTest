package com.dbtest.service;

import java.util.List;

import com.dbtest.entity.Usuario;

public interface IUsuarioService {


	  public List<Usuario> listar();
	  
	  public boolean Grabar(Usuario usuario);
	  
	  public boolean Actualizar(Usuario usuario);
	  
	  public void Eliminar(Long id);
}
