package com.example.cinestream.perfil;

import org.springframework.stereotype.Service;

import com.example.cinestream.common.GenericCrudService;

@Service
public class PerfilService extends GenericCrudService<Perfil, PerfilId> {

    public PerfilService(PerfilRepository repository) {
        super(repository, "Perfil");
    }
}
