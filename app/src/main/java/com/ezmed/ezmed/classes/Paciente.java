package com.ezmed.ezmed.classes;

import java.io.Serializable;

/**
 * Created by Monster on 19/10/2017.
 */

public class Paciente implements Serializable {
    private String nomeP,dataP;
    private float pesoP,alturaP;


    public Paciente() {
    }

    public Paciente(String nomeP, String dataP, float pesoP, float alturaP) {
        this.nomeP = nomeP;
        this.dataP = dataP;
        this.pesoP = pesoP;
        this.alturaP = alturaP;
    }

    public String getNomeP() {
        return nomeP;
    }

    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }

    public String getDataP() {
        return dataP;
    }

    public void setDataP(String dataP) {
        this.dataP = dataP;
    }

    public float getPesoP() {
        return pesoP;
    }

    public void setPesoP(float pesoP) {
        this.pesoP = pesoP;
    }

    public float getAlturaP() {
        return alturaP;
    }

    public void setAlturaP(float alturaP) {
        this.alturaP = alturaP;
    }
}
