package model.entities;

import java.io.Serializable;

public class Proposta implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String cod;
    private String descricao;

    public Proposta() {
    }

    public Proposta(Integer id, String cod, String descricao) {
        this.id = id;
        this.cod = cod;
        this.descricao = descricao;
    }

    // Getters e Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Proposta other = (Proposta) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Proposta [id=" + id + ", cod=" + cod + ", descricao=" + descricao + "]";
    }
}
