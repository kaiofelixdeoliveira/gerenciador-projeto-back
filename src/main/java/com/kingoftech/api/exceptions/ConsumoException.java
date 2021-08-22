package com.kingoftech.api.exceptions;


public class ConsumoException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ConsumoException(String message) {
        super(message);
    }

    public ConsumoException(String message, Throwable cause) {
        super(message, cause);
        
        
    }
    
    //master alterado
}
