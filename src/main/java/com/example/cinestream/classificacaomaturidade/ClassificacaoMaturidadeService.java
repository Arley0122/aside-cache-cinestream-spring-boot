package com.example.cinestream.classificacaomaturidade;

import org.springframework.stereotype.Service;

import com.example.cinestream.common.GenericCrudService;

@Service
public class ClassificacaoMaturidadeService extends GenericCrudService<ClassificacaoMaturidade, Long> {

    public ClassificacaoMaturidadeService(ClassificacaoMaturidadeRepository repository) {
        super(repository, "Classificacao de maturidade");
    }
}
