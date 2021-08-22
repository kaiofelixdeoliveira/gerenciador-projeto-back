package com.kingoftech.api.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.kingoftech.api.entities.Projetos;

import org.springframework.stereotype.Repository;

@Repository
@CrossOrigin(origins = "*")
public interface SimiosRepository extends JpaRepository<Projetos, Long> {

	/*
	 * @Modifying
	 * 
	 * @Query("insert into TaskDocumentEntity (idTask,description,filepath) select :idTask,:description,:filepath from Dual"
	 * ) public void insertDocumentByTaskId(@Param("idTask") Long
	 * id,@Param("description") String description,@Param("filepath") String
	 * filepath);
	 */
	Optional<Projetos> findById(int id);

	@Query(value = "insert into app_projetos (descricao,codigo) VALUES (:descricao,:codigo);", nativeQuery = true)
	Projetos newProjeto(@Param("descricao") String descricao, @Param("codigo") String codigo);

}
