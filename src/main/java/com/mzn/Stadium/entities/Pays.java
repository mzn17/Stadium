package com.mzn.Stadium.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Pays {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPays;

    private String nomPays;

    private String continent;

    @JsonIgnore
    @OneToMany(mappedBy = "pays")
    private List<Stade> stades;

    public Pays() {
        super();
    }

    public Pays(String nomPays, String continent, List<Stade> stades) {
        super();
        this.nomPays = nomPays;
        this.continent = continent;
        this.stades = stades;
    }

    public Long getIdPays() {
        return idPays;
    }

    public void setIdPays(Long idPays) {
        this.idPays = idPays;
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public List<Stade> getStades() {
        return stades;
    }

    public void setStades(List<Stade> stades) {
        this.stades = stades;
    }

    @Override
    public String toString() {
        return "Pays [idPays=" + idPays + ", nomPays=" + nomPays
                + ", continent=" + continent + "]";
    }
}