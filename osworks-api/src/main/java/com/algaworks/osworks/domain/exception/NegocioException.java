package com.algaworks.osworks.domain.exception;

public class NegocioException extends RuntimeException {

    private static final long serialVersionUID = -809319978862266568L;

    public NegocioException(String message) {
        super(message);
    }

}
