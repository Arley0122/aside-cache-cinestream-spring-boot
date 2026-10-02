package com.example.cinestream.common;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class GenericCrudService<T, ID> {

    private final JpaRepository<T, ID> repository;
    private final String resourceName;

    protected GenericCrudService(JpaRepository<T, ID> repository, String resourceName) {
        this.repository = repository;
        this.resourceName = resourceName;
    }
    
    public List<T> listar() {
        return repository.findAll();
    }

    public T buscarPorId(ID id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(resourceName, id));
    }

    public T criar(T entity) {
        return repository.save(entity);
    }

    public T atualizar(ID id, T entity) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException(resourceName, id);
        }
        return repository.save(entity);
    }

    public void excluir(ID id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException(resourceName, id);
        }
        repository.deleteById(id);
    }
}
