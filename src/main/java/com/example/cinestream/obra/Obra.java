package com.example.cinestream.obra;

import java.util.ArrayList;
import java.util.List;

import com.example.cinestream.episodio.Episodio;
import com.example.cinestream.obragenero.ObraGenero;
import com.example.cinestream.obraprofissional.ObraProfissional;
import com.example.cinestream.visualizacao.Visualizacao;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "obra")
public class Obra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(columnDefinition = "TEXT")
    private String sinopse;

    @Column(name = "ano_lancamento")
    private Integer anoLancamento;

    @Column(name = "idade_minima_recomendada", nullable = false)
    private Integer idadeMinimaRecomendada;

    @JsonIgnore
    @OneToMany(mappedBy = "obra", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ObraGenero> generos = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "obra", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ObraProfissional> profissionais = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "obra", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Episodio> episodios = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "obra")
    private List<Visualizacao> visualizacoes = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Integer getIdadeMinimaRecomendada() {
        return idadeMinimaRecomendada;
    }

    public void setIdadeMinimaRecomendada(Integer idadeMinimaRecomendada) {
        this.idadeMinimaRecomendada = idadeMinimaRecomendada;
    }

    public List<ObraGenero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<ObraGenero> generos) {
        this.generos = generos;
    }

    public List<ObraProfissional> getProfissionais() {
        return profissionais;
    }

    public void setProfissionais(List<ObraProfissional> profissionais) {
        this.profissionais = profissionais;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(List<Episodio> episodios) {
        this.episodios = episodios;
    }

    public List<Visualizacao> getVisualizacoes() {
        return visualizacoes;
    }

    public void setVisualizacoes(List<Visualizacao> visualizacoes) {
        this.visualizacoes = visualizacoes;
    }
}
