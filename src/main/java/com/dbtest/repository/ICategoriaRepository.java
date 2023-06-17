package com.dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbtest.entity.Categoria;

public interface ICategoriaRepository extends JpaRepository<Categoria, Long> {

}
