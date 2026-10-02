package com.example.cinestream.obragenero;

import org.springframework.stereotype.Service;

import com.example.cinestream.common.GenericCrudService;

@Service
public class ObraGeneroService extends GenericCrudService<ObraGenero, ObraGeneroId> {

    public ObraGeneroService(ObraGeneroRepository repository) {
        super(repository, "Obra genero");
    }
}
