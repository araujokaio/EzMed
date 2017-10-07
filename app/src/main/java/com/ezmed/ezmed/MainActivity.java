package com.ezmed.ezmed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.ezmed.ezmed.R;
import com.ezmed.util.MeuAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MeuAdapter adapter = new MeuAdapter(this, generateData());

        ListView lv = (ListView) findViewById(R.id.mainLvAlarme);

        lv.setAdapter(adapter);
    }

    private ArrayList<com.ezmed.dto.Alerta> generateData()
    {
        ArrayList<com.ezmed.dto.Alerta> lista = new ArrayList<>();

        lista.add(com.ezmed.util.Ferramentas.gerarAlertaRandomico());
        lista.add(com.ezmed.util.Ferramentas.gerarAlertaRandomico());
        lista.add(com.ezmed.util.Ferramentas.gerarAlertaRandomico());
        lista.add(com.ezmed.util.Ferramentas.gerarAlertaRandomico());
        lista.add(com.ezmed.util.Ferramentas.gerarAlertaRandomico());
        lista.add(com.ezmed.util.Ferramentas.gerarAlertaRandomico());

        return lista;
    }
}
