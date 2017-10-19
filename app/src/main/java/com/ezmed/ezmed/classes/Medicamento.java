package com.ezmed.ezmed.classes;

import java.io.Serializable;

/**
 * Created by Monster on 19/10/2017.
 */

public class Medicamento implements Serializable {

    private String nomeMed,tipoMed;
    private boolean cbStatus;

    public Medicamento() {
    }

    public Medicamento(String nomeMed, String tipoMed, boolean cbStatus) {
        this.nomeMed = nomeMed;
        this.tipoMed = tipoMed;
        this.cbStatus = cbStatus;
    }

    public String getNomeMed() {
        return nomeMed;
    }

    public void setNomeMed(String nomeMed) {
        this.nomeMed = nomeMed;
    }

    public String getTipoMed() {
        return tipoMed;
    }

    public void setTipoMed(String tipoMed) {
        this.tipoMed = tipoMed;
    }

    public boolean isCbStatus() {
        return cbStatus;
    }

    public void setCbStatus(boolean cbStatus) {
        this.cbStatus = cbStatus;
    }
}
