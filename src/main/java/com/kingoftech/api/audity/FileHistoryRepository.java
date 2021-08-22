package com.kingoftech.api.audity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileHistoryRepository extends JpaRepository<FileHistory, Integer> {
}