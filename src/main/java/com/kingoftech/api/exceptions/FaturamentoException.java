package com.kingoftech.api.exceptions;


public class FaturamentoException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public FaturamentoException(String message) {
        super(message);
    }

    public FaturamentoException(String message, Throwable cause) {
        super(message, cause);
        
        
    }
    
    //master alterado
}
