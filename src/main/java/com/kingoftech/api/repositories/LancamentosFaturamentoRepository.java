package com.kingoftech.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kingoftech.api.entities.Faturamentos;
import com.kingoftech.api.entities.LancamentosFaturamento;

@Repository
public interface LancamentosFaturamentoRepository extends JpaRepository<LancamentosFaturamento, Long> {

	Faturamentos findById(int id);
}
