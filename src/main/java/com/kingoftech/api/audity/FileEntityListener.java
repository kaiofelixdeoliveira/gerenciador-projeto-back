package com.kingoftech.api.audity;

import javax.persistence.EntityManager;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.kingoftech.api.controllers.AuthenticationController;

import static com.kingoftech.api.audity.Action.*;
import static javax.transaction.Transactional.TxType.MANDATORY;

public class FileEntityListener<U> {

	private static final Logger LOG = LoggerFactory.getLogger(AuthenticationController.class);
	
	
    

    @PreUpdate
    public void preUpdate(U target) {
    	LOG.info("Estado da query corrente auditada: "+UPDATED.toString()+target);
        perform(target, UPDATED);
    }

    @PreRemove
    public void preRemove(U target) {
    	LOG.info("Estado da query corrente auditada: "+DELETED.toString()+target);
        perform(target, DELETED);
    }
    
    @PrePersist
    public void prePersist(U target) {
    	LOG.info("Estado da query corrente auditada: "+INSERTED.toString()+target);
        perform(target, INSERTED);
    }

    @Transactional(MANDATORY)
    private void perform(U target, Action action) {
    	
    	
        EntityManager entityManager = BeanUtil.getBean(EntityManager.class);
        LOG.info("Gravando historico da transação no banco...");
        entityManager.persist(new FileHistory(target, action));
    }

}