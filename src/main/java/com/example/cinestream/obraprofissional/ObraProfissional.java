package com.example.cinestream.obraprofissional;

import com.example.cinestream.obra.Obra;
import com.example.cinestream.profissional.Profissional;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "obra_profissional")
public class ObraProfissional {

    @EmbeddedId
    private ObraProfissionalId id;

    @MapsId("profissionalId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_profissional", nullable = false)
    private Profissional profissional;

    @MapsId("obraId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_obra", nullable = false)
    private Obra obra;

    public ObraProfissionalId getId() {
        return id;
    }

    public void setId(ObraProfissionalId id) {
        this.id = id;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }
}
