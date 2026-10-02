package com.example.cinestream.obraprofissional;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Embeddable
public class ObraProfissionalId implements Serializable {

    @Column(name = "id_profissional")
    private Long profissionalId;

    @Column(name = "id_obra")
    private Long obraId;

    @Enumerated(EnumType.STRING)
    @Column(name = "funcao")
    private FuncaoProfissional funcao;

    public ObraProfissionalId() {
    }

    public ObraProfissionalId(Long profissionalId, Long obraId, FuncaoProfissional funcao) {
        this.profissionalId = profissionalId;
        this.obraId = obraId;
        this.funcao = funcao;
    }

    public Long getProfissionalId() {
        return profissionalId;
    }

    public void setProfissionalId(Long profissionalId) {
        this.profissionalId = profissionalId;
    }

    public Long getObraId() {
        return obraId;
    }

    public void setObraId(Long obraId) {
        this.obraId = obraId;
    }

    public FuncaoProfissional getFuncao() {
        return funcao;
    }

    public void setFuncao(FuncaoProfissional funcao) {
        this.funcao = funcao;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ObraProfissionalId that)) {
            return false;
        }
        return Objects.equals(profissionalId, that.profissionalId)
                && Objects.equals(obraId, that.obraId)
                && funcao == that.funcao;
    }

    @Override
    public int hashCode() {
        return Objects.hash(profissionalId, obraId, funcao);
    }
}
