package com.dbtest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbtest.entity.Usuario;
import com.dbtest.repository.IUsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService {
	
	@Autowired
	IUsuarioRepository _repository;

	@Override
	public List<Usuario> listar() {
		List<Usuario> lista = _repository.findAll();
		return lista;
	}

	@Override
	public boolean Grabar(Usuario usuario) {
		_repository.save(usuario);
		return true;
	}

	@Override
	public boolean Actualizar(Usuario usuario) {
		Optional<Usuario> usuarioExistente = _repository.findById(usuario.getId());
		if(usuarioExistente.isPresent())
		{
			_repository.save(usuario);
			return true;
		}
		return false;
	}

	@Override
	public void Eliminar(Long id) {
		_repository.deleteById(id);
	}

	

}
