package com.kingoftech.api.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.kingoftech.api.entities.Usuarios;

import org.springframework.stereotype.Repository;

@Repository
@Transactional(readOnly = true)
public interface UsuarioRepository extends JpaRepository<Usuarios, Long> {
	Optional<Usuarios> findByEmail(String email);
	Optional<Usuarios> findByNome(String nome);
}
