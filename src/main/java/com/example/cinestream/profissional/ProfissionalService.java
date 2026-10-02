package com.example.cinestream.profissional;

import org.springframework.stereotype.Service;

import com.example.cinestream.common.GenericCrudService;

@Service
public class ProfissionalService extends GenericCrudService<Profissional, Long> {

    public ProfissionalService(ProfissionalRepository repository) {
        super(repository, "Profissional");
    }
}
