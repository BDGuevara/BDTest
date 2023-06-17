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

import com.dbtest.entity.Categoria;
import com.dbtest.entity.Producto;
import com.dbtest.entity.Usuario;
import com.dbtest.service.ICategoriaService;
import com.dbtest.service.IProductoService;
import com.dbtest.service.IUsuarioService;

@RestController
public class UsuarioController {

	@Autowired
	IUsuarioService _service;
	 
	@Autowired
	ICategoriaService _categoriaservice;
	
	@Autowired
	IProductoService _productoservice;
	
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
	
	//metodos para la categoria
	@GetMapping(value="categorias",produces={"application/json"})
	ResponseEntity<List<Categoria>> listarcategoria(){
		List<Categoria> lista = _categoriaservice.listar();
		return new ResponseEntity<List<Categoria>>(lista, HttpStatus.OK);
	}
	
	//metodos para el producto
		@GetMapping(value="productos",produces={"application/json"})
		ResponseEntity<List<Producto>> listarproducto(){
			List<Producto> lista = _productoservice.listar();
			return new ResponseEntity<List<Producto>>(lista, HttpStatus.OK);
		}
	
}
