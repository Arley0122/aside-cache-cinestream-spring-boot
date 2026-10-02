package com.example.cinestream.classificacaomaturidade;

import java.util.ArrayList;
import java.util.List;

import com.example.cinestream.perfil.Perfil;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "classificacao_maturidade")
public class ClassificacaoMaturidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private ClassificacaoDescricao descricao;

    @JsonIgnore
    @OneToMany(mappedBy = "classificacaoMaturidade")
    private List<Perfil> perfis = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClassificacaoDescricao getDescricao() {
        return descricao;
    }

    public void setDescricao(ClassificacaoDescricao descricao) {
        this.descricao = descricao;
    }

    public List<Perfil> getPerfis() {
        return perfis;
    }

    public void setPerfis(List<Perfil> perfis) {
        this.perfis = perfis;
    }
}
