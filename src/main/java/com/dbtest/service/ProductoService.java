package com.dbtest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dbtest.entity.Producto;

@Service
public class ProductoService implements IProductoService {

	@Override
	public List<Producto> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean Grabar(Producto producto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Actualizar(Producto producto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void Eliminar(Long id) {
		// TODO Auto-generated method stub
		
	}

}
