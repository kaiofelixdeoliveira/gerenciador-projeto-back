package com.kingoftech.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kingoftech.api.entities.ProjectManagers;

@Repository
public interface ProjectManagerRepository extends JpaRepository<ProjectManagers, Long> {

	ProjectManagers findById(int id);
}
