package com.dbtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
}
