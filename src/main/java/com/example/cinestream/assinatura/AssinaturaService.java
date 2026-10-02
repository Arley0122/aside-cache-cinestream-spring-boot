package com.example.cinestream.assinatura;

import org.springframework.stereotype.Service;

import com.example.cinestream.common.GenericCrudService;

@Service
public class AssinaturaService extends GenericCrudService<Assinatura, Long> {

    public AssinaturaService(AssinaturaRepository repository) {
        super(repository, "Assinatura");
    }
}
