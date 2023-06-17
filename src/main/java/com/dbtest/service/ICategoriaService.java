package com.dbtest.service;

import java.util.List;

import com.dbtest.entity.Categoria;


public interface ICategoriaService {

public  List<Categoria> listar();
	
	public boolean Grabar(Categoria categoria);

	public boolean Actualizar(Categoria categoria);

	public void Eliminar(Long id);
	
}

