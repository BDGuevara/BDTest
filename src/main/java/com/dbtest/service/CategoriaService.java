package com.dbtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbtest.entity.Categoria;

import com.dbtest.repository.ICategoriaRepository;

@Service
public class CategoriaService implements ICategoriaService {

	@Autowired
	ICategoriaRepository _repository;
	@Override
	public List<Categoria> listar() {
		List<Categoria> lista = _repository.findAll();
		return lista;
	}

	@Override
	public boolean Grabar(Categoria categoria) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Actualizar(Categoria categoria) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void Eliminar(Long id) {
		// TODO Auto-generated method stub
		
	}

}
