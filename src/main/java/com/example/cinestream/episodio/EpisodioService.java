package com.example.cinestream.episodio;

import org.springframework.stereotype.Service;

import com.example.cinestream.common.GenericCrudService;

@Service
public class EpisodioService extends GenericCrudService<Episodio, EpisodioId> {

    public EpisodioService(EpisodioRepository repository) {
        super(repository, "Episodio");
    }
}
