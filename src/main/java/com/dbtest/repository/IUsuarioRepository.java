package com.dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbtest.entity.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

}
