package com.ezmed.ezmed.classes;

import java.io.Serializable;

/**
 * Created by Monster on 19/10/2017.
 */

public class Tratamento implements Serializable {
    private String nomeMed, doseMed, dataI, dataF, obsMed, spTipo;


    public Tratamento() {
    }

    public Tratamento(String nomeMed, String doseMed, String dataI, String dataF, String obsMed, String spTipo) {
        this.nomeMed = nomeMed;
        this.doseMed = doseMed;
        this.dataI = dataI;
        this.dataF = dataF;
        this.obsMed = obsMed;
        this.spTipo = spTipo;
    }

    public String getNomeMed() {
        return nomeMed;
    }

    public void setNomeMed(String nomeMed) {
        this.nomeMed = nomeMed;
    }

    public String getDoseMed() {
        return doseMed;
    }

    public void setDoseMed(String doseMed) {
        this.doseMed = doseMed;
    }

    public String getDataI() {
        return dataI;
    }

    public void setDataI(String dataI) {
        this.dataI = dataI;
    }

    public String getDataF() {
        return dataF;
    }

    public void setDataF(String dataF) {
        this.dataF = dataF;
    }

    public String getObsMed() {
        return obsMed;
    }

    public void setObsMed(String obsMed) {
        this.obsMed = obsMed;
    }

    public String isCbTipo() {
        return spTipo;
    }

    public void setCbTipo(String cbTipo) {
        this.spTipo = spTipo;
    }
}
