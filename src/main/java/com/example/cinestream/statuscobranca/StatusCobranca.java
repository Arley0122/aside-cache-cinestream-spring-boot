package com.example.cinestream.statuscobranca;

import java.util.ArrayList;
import java.util.List;

import com.example.cinestream.fatura.Fatura;
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
@Table(name = "status_cobranca")
public class StatusCobranca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private StatusCobrancaDescricao descricao;

    @JsonIgnore
    @OneToMany(mappedBy = "statusCobranca")
    private List<Fatura> faturas = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StatusCobrancaDescricao getDescricao() {
        return descricao;
    }

    public void setDescricao(StatusCobrancaDescricao descricao) {
        this.descricao = descricao;
    }

    public List<Fatura> getFaturas() {
        return faturas;
    }

    public void setFaturas(List<Fatura> faturas) {
        this.faturas = faturas;
    }
}
