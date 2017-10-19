package com.ezmed.ezmed.classes;

import java.io.Serializable;

/**
 * Created by Monster on 19/10/2017.
 */

public class Alerta implements Serializable {

    private String horaIA,cuidadorA,tratamentoA,pacienteA,observacaoA;

    public Alerta(String horaIA, String cuidadorA, String tratamentoA, String pacienteA, String observacaoA) {
        this.horaIA = horaIA;
        this.cuidadorA = cuidadorA;
        this.tratamentoA = tratamentoA;
        this.pacienteA = pacienteA;
        this.observacaoA = observacaoA;
    }

    public Alerta() {
    }

    public String getHoraIA() {
        return horaIA;
    }

    public void setHoraIA(String horaIA) {
        this.horaIA = horaIA;
    }

    public String getCuidadorA() {
        return cuidadorA;
    }

    public void setCuidadorA(String cuidadorA) {
        this.cuidadorA = cuidadorA;
    }

    public String getTratamentoA() {
        return tratamentoA;
    }

    public void setTratamentoA(String tratamentoA) {
        this.tratamentoA = tratamentoA;
    }

    public String getPacienteA() {
        return pacienteA;
    }

    public void setPacienteA(String pacienteA) {
        this.pacienteA = pacienteA;
    }

    public String getObservacaoA() {
        return observacaoA;
    }

    public void setObservacaoA(String observacaoA) {
        this.observacaoA = observacaoA;
    }
}
