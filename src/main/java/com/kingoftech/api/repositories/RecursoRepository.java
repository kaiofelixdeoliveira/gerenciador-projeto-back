package com.kingoftech.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kingoftech.api.entities.Recursos;

@Repository
public interface RecursoRepository extends JpaRepository<Recursos, Long> {

	Recursos findById(int id);
}
