package com.dbtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dbtest.entity.Producto;
import com.dbtest.repository.IProductoRepository;

@Service
public class ProductoService implements IProductoService {

	
	@Autowired
	IProductoRepository _repository;
	@Override
	public List<Producto> listar() {
		List<Producto> lista = _repository.findAll();
		return lista;
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
