package com.example.cinestream.common;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String resourceName, Object id) {
        super(resourceName + " nao encontrado(a): " + id);
    }
}
