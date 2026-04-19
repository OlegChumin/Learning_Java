package com.zaurtregulov.spring.rest.exception_handling;

public class NuSuchEmployeeException extends RuntimeException{
    public NuSuchEmployeeException(String message) {
        super(message);
    }
}
