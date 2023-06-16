package com.dbtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbtest.entity.Usuario;
import com.dbtest.service.IUsuarioService;

@RestController
public class UsuarioController {

	@Autowired
	IUsuarioService _service;
		
	@GetMapping(value="usuarios",produces={"application/json"})
	ResponseEntity<List<Usuario>> listar(){
		List<Usuario> lista = _service.listar();
		return new ResponseEntity<List<Usuario>>(lista, HttpStatus.OK);
	}
	
	@PostMapping(value="usuarios",consumes={"application/json"})
	public ResponseEntity<Void> grabarUsuario(@RequestBody Usuario usuario){
		if (_service.Grabar(usuario)) {
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		else {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping(value="usuarios",consumes={"application/json"})
	public ResponseEntity<Void> actualizarUsuario(@RequestBody Usuario usuario){
		if (_service.Actualizar(usuario)) {
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		else {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}
	
	@DeleteMapping(value="usuarios/{id}")
	public ResponseEntity<Void> eliminarUsuario(@PathVariable("id") Long id){
		_service.Eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
