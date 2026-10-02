package com.example.cinestream.obragenero;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ObraGeneroId implements Serializable {

    @Column(name = "id_obra")
    private Long obraId;

    @Column(name = "id_genero")
    private Long generoId;

    public ObraGeneroId() {
    }

    public ObraGeneroId(Long obraId, Long generoId) {
        this.obraId = obraId;
        this.generoId = generoId;
    }

    public Long getObraId() {
        return obraId;
    }

    public void setObraId(Long obraId) {
        this.obraId = obraId;
    }

    public Long getGeneroId() {
        return generoId;
    }

    public void setGeneroId(Long generoId) {
        this.generoId = generoId;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ObraGeneroId that)) {
            return false;
        }
        return Objects.equals(obraId, that.obraId) && Objects.equals(generoId, that.generoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obraId, generoId);
    }
}
