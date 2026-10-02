package com.example.cinestream.plano;

import java.util.ArrayList;
import java.util.List;

import com.example.cinestream.assinatura.Assinatura;
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
@Table(name = "plano")
public class Plano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_do_plano", nullable = false, unique = true)
    private String nomeDoPlano;

    @Column(name = "quantidade_maxima_de_telas", nullable = false)
    private Integer quantidadeMaximaDeTelas;

    @Enumerated(EnumType.STRING)
    @Column(name = "qualidade_de_resolucao", nullable = false)
    private QualidadeResolucao qualidadeDeResolucao;

    @JsonIgnore
    @OneToMany(mappedBy = "plano")
    private List<Assinatura> assinaturas = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDoPlano() {
        return nomeDoPlano;
    }

    public void setNomeDoPlano(String nomeDoPlano) {
        this.nomeDoPlano = nomeDoPlano;
    }

    public Integer getQuantidadeMaximaDeTelas() {
        return quantidadeMaximaDeTelas;
    }

    public void setQuantidadeMaximaDeTelas(Integer quantidadeMaximaDeTelas) {
        this.quantidadeMaximaDeTelas = quantidadeMaximaDeTelas;
    }

    public QualidadeResolucao getQualidadeDeResolucao() {
        return qualidadeDeResolucao;
    }

    public void setQualidadeDeResolucao(QualidadeResolucao qualidadeDeResolucao) {
        this.qualidadeDeResolucao = qualidadeDeResolucao;
    }

    public List<Assinatura> getAssinaturas() {
        return assinaturas;
    }

    public void setAssinaturas(List<Assinatura> assinaturas) {
        this.assinaturas = assinaturas;
    }
}
