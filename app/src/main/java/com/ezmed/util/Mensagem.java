package com.ezmed.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by kaiom on 13/07/2017.
 */

public class Mensagem {

    public static void exibirToastCurto(Context contexto, String mensagem){
        Toast.makeText(contexto, mensagem, Toast.LENGTH_SHORT).show();
    }

    public static void exibirToastLongo(Context contexto, String mensagem){
        Toast.makeText(contexto, mensagem, Toast.LENGTH_LONG).show();
    }
}
