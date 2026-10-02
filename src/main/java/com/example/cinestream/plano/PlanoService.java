package com.example.cinestream.plano;

import org.springframework.stereotype.Service;

import com.example.cinestream.common.GenericCrudService;

@Service
public class PlanoService extends GenericCrudService<Plano, Long> {

    public PlanoService(PlanoRepository repository) {
        super(repository, "Plano");
    }
}
