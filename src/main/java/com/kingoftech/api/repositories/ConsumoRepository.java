package com.kingoftech.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kingoftech.api.entities.Consumos;

@Repository
public interface ConsumoRepository extends JpaRepository<Consumos, Long> {

	Consumos findById(int id);
}
