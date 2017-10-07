package com.ezmed.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.ezmed.dto.Alerta;
import com.ezmed.ezmed.R;

import java.util.ArrayList;

public class MeuAdapter extends ArrayAdapter<com.ezmed.dto.Alerta> {

    private final Context contexto;
    private final ArrayList<com.ezmed.dto.Alerta> listaAlarmes;

    public MeuAdapter(Context contexto, ArrayList<Alerta> listaAlarmes)
    {
        super(contexto, R.layout.alarm_row, listaAlarmes);
        this.contexto = contexto;
        this.listaAlarmes = listaAlarmes;
    }

    @Override
    public View getView(int posicao, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View viewRowAlarme = inflater.inflate(R.layout.alarm_row, parent, false);

        TextView nomeRemedioView = (TextView) viewRowAlarme.findViewById(R.id.alaram_nome_remedio);
        TextView horarioRemedioView = (TextView) viewRowAlarme.findViewById(R.id.alarm_horario_remedio);

        nomeRemedioView.setText("teste");
        nomeRemedioView.setText("teste");
        return viewRowAlarme;
    }

}
