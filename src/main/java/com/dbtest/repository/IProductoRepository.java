package com.dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbtest.entity.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Long> {

}
