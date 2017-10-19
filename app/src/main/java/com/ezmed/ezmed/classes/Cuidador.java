package com.ezmed.ezmed.classes;

import java.io.Serializable;

/**
 * Created by Monster on 19/10/2017.
 */

public class Cuidador implements Serializable {

    private String nome,email,cel,observacao;

    public Cuidador(){}

    public Cuidador(String nome, String email, String cel, String observacao) {
        this.nome = nome;
        this.email = email;
        this.cel = cel;
        this.observacao = observacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
