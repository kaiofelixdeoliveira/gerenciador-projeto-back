package com.kingoftech.api.exceptions;


public class ProjectManagerException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ProjectManagerException(String message) {
        super(message);
    }

    public ProjectManagerException(String message, Throwable cause) {
        super(message, cause);
        
        
    }
    
    //master alterado
}
