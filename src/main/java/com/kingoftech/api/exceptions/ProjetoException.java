package com.kingoftech.api.exceptions;


public class ProjetoException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ProjetoException(String message) {
        super(message);
    }

    public ProjetoException(String message, Throwable cause) {
        super(message, cause);
        
        
    }
    
    //master alterado
}
