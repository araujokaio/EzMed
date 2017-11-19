package com.ezmed.gerenciamento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.ezmed.adapters.CuidadorAdapter;
import com.ezmed.dto.Alerta;
import com.ezmed.dto.Cuidador;
import com.ezmed.ezmed.R;

import java.util.ArrayList;
import java.util.List;

public class GerenciarCuidadorActivity extends AppCompatActivity {

    private ListView lvCuidador;
    private List<Cuidador> listaCuidador;
    CuidadorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerenciar_cuidador);

        lvCuidador = (ListView) findViewById(R.id.gerenciarCuidadorLvCuidador);

        listaCuidador = generateData();

        adapter = new CuidadorAdapter(getApplicationContext(), listaCuidador);
        lvCuidador.setAdapter(adapter);
    }

    private ArrayList<Cuidador> generateData()
    {
        ArrayList<com.ezmed.dto.Cuidador> listaCuidadores = new ArrayList<>();

        for(int i =0; i < 15; i++)
        {
            listaCuidadores.add(com.ezmed.util.Ferramentas.gerarCuidadorRandomico());
        }

        return listaCuidadores;
    }
}
