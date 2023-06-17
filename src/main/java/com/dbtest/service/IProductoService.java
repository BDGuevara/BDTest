package com.dbtest.service;

import java.util.List;

import com.dbtest.entity.Producto;

public interface IProductoService {

	public  List<Producto> listar();
	
	public boolean Grabar(Producto producto);

	public boolean Actualizar(Producto producto);

	public void Eliminar(Long id);
	
}
