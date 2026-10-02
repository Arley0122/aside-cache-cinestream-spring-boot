package com.example.cinestream.obraprofissional;

import org.springframework.stereotype.Service;

import com.example.cinestream.common.GenericCrudService;

@Service
public class ObraProfissionalService extends GenericCrudService<ObraProfissional, ObraProfissionalId> {

    public ObraProfissionalService(ObraProfissionalRepository repository) {
        super(repository, "Obra profissional");
    }
}
