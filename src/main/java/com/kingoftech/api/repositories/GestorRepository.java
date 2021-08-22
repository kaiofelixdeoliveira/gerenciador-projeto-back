package com.kingoftech.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kingoftech.api.entities.Gestores;

@Repository
public interface GestorRepository extends JpaRepository<Gestores, Long> {

	Gestores findById(int id);
}
