package com.example.cinestream.fatura;

import org.springframework.stereotype.Service;

import com.example.cinestream.common.GenericCrudService;

@Service
public class FaturaService extends GenericCrudService<Fatura, Long> {

    public FaturaService(FaturaRepository repository) {
        super(repository, "Fatura");
    }
}
