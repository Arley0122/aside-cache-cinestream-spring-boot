package com.example.cinestream.profissional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.cinestream.obraprofissional.ObraProfissional;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "profissional")
public class Profissional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_artistico", nullable = false)
    private String nomeArtistico;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "pais_origem")
    private String paisOrigem;

    @JsonIgnore
    @OneToMany(mappedBy = "profissional")
    private List<ObraProfissional> obras = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeArtistico() {
        return nomeArtistico;
    }

    public void setNomeArtistico(String nomeArtistico) {
        this.nomeArtistico = nomeArtistico;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public List<ObraProfissional> getObras() {
        return obras;
    }

    public void setObras(List<ObraProfissional> obras) {
        this.obras = obras;
    }
}
