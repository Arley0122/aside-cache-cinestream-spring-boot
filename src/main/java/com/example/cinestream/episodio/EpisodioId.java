package com.example.cinestream.episodio;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class EpisodioId implements Serializable {

    @Column(name = "id_obra")
    private Long obraId;

    @Column(name = "numero_temporada")
    private Integer numeroTemporada;

    @Column(name = "numero_capitulo")
    private Integer numeroCapitulo;

    public EpisodioId() {
    }

    public EpisodioId(Long obraId, Integer numeroTemporada, Integer numeroCapitulo) {
        this.obraId = obraId;
        this.numeroTemporada = numeroTemporada;
        this.numeroCapitulo = numeroCapitulo;
    }

    public Long getObraId() {
        return obraId;
    }

    public void setObraId(Long obraId) {
        this.obraId = obraId;
    }

    public Integer getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(Integer numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public Integer getNumeroCapitulo() {
        return numeroCapitulo;
    }

    public void setNumeroCapitulo(Integer numeroCapitulo) {
        this.numeroCapitulo = numeroCapitulo;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof EpisodioId that)) {
            return false;
        }
        return Objects.equals(obraId, that.obraId)
                && Objects.equals(numeroTemporada, that.numeroTemporada)
                && Objects.equals(numeroCapitulo, that.numeroCapitulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obraId, numeroTemporada, numeroCapitulo);
    }
}
