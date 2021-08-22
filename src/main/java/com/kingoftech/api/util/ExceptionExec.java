package com.kingoftech.api.util;

public class ExceptionExec extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public ExceptionExec(String message) {
		super(message);
	}
	
	public ExceptionExec(String message, Throwable cause) {
        super(message, cause);       
    }
}