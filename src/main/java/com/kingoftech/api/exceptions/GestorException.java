package com.kingoftech.api.exceptions;


public class GestorException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public GestorException(String message) {
        super(message);
    }

    public GestorException(String message, Throwable cause) {
        super(message, cause);
        
        
    }
    
    //master alterado
}
