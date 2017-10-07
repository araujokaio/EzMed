package com.ezmed.ezmed.core;

public class Login {

    public static int efetuarLogin(com.ezmed.dto.Usuario usuario)
    {
        com.ezmed.bll.Usuario bllUsuario = new com.ezmed.bll.Usuario();

        return bllUsuario.logarUsuario(usuario);
    }
}
