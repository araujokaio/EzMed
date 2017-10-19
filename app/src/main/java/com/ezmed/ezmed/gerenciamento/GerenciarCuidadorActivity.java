package com.ezmed.ezmed.gerenciamento;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.pm.ActivityInfoCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.ezmed.ezmed.R;
import com.ezmed.ezmed.adapters.CuidadorAdapter;
import com.ezmed.ezmed.classes.Cuidador;
import com.ezmed.ezmed.criacao.CriarCuidadorActivity;

import java.util.ArrayList;
import java.util.List;

public class GerenciarCuidadorActivity extends Activity {

    private List<Cuidador> cuidadores;
    private CuidadorAdapter adaptador;
    private ListView listaCuidadores;
    private FloatingActionButton botaof;

    //--


    //--



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerenciar_cuidador);

        //OK
        listaCuidadores = (ListView) findViewById(R.id.gerenciarCuidadorLvCuidador);
        botaof = (FloatingActionButton) findViewById(R.id.gerenciarCuidadorBtnCriar);
        Cuidador objC = (Cuidador) getIntent().getSerializableExtra("objC");

        //---

        //ERRO
        /*
        setContentView(listaCuidadores);
        cuidadores = new ArrayList<Cuidador>();

        cuidadores.add(objC);
        adaptador = new CuidadorAdapter(this,cuidadores);
        listaCuidadores.setAdapter(adaptador);

        */

        //---











        botaof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GerenciarCuidadorActivity.this, CriarCuidadorActivity.class);
                startActivity(intent);

            }
        });

    }
}
