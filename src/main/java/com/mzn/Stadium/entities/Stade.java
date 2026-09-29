package com.mzn.Stadium.entities;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Stade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStade;
    private String nomStade;
    private Integer capacite;
    private Date dateConstruction;

    public Stade() {
        super();
    }

    public Stade(String nomStade, Integer capacite, Date dateConstruction) {
        super();
        this.nomStade = nomStade;
        this.capacite = capacite;
        this.dateConstruction = dateConstruction;
    }

    public Long getIdStade() {
        return idStade;
    }

    public void setIdStade(Long idStade) {
        this.idStade = idStade;
    }

    public String getNomStade() {
        return nomStade;
    }

    public void setNomStade(String nomStade) {
        this.nomStade = nomStade;
    }

    public Integer getCapacite() {
        return capacite;
    }

    public void setCapacite(Integer capacite) {
        this.capacite = capacite;
    }

    public Date getDateConstruction() {
        return dateConstruction;
    }

    public void setDateConstruction(Date dateConstruction) {
        this.dateConstruction = dateConstruction;
    }

    @Override
    public String toString() {
        return "Stade [idStade=" + idStade + ", nomStade=" + nomStade + ", capacite=" + capacite
                + ", dateConstruction=" + dateConstruction + "]";
    }
}