package com.example.cinestream.visualizacao;

import org.springframework.stereotype.Service;

import com.example.cinestream.common.GenericCrudService;

@Service
public class VisualizacaoService extends GenericCrudService<Visualizacao, Long> {

    public VisualizacaoService(VisualizacaoRepository repository) {
        super(repository, "Visualizacao");
    }
}
