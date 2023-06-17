package com.dbtest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	@Column(name = "producto")
	private String producto;
	@Column(name = "precio")
	private Long precio;
	@Column(name = "categoriaid")
	private Long categoriaid;

}
