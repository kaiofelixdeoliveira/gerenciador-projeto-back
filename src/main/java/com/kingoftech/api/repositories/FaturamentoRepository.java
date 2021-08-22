package com.kingoftech.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kingoftech.api.entities.Faturamentos;

@Repository
public interface FaturamentoRepository extends JpaRepository<Faturamentos, Long> {

	Faturamentos findById(int id);
}
