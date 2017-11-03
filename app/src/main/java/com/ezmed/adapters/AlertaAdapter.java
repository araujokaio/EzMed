package com.ezmed.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ezmed.dto.Alerta;
import com.ezmed.ezmed.R;

import java.util.List;

/**
 * Created by araujokaio on 02/11/17.
 */

public class AlertaAdapter extends BaseAdapter
{

    private Context ctx;
    private List<Alerta> listAlerta;
    private TextView nomeTratamento;
    private TextView nomeRemedio;
    private TextView horarioRemedio;

    public AlertaAdapter(Context ctx, List<Alerta> listAlerta)
    {
        this.ctx = ctx;
        this.listAlerta = listAlerta;
    }

    @Override
    public int getCount()
    {
        return listAlerta.size();
    }

    @Override
    public Object getItem(int position)
    {
        return listAlerta.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return listAlerta.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View v = View.inflate(ctx, R.layout.alarm_row, null);

        nomeTratamento = (TextView) v.findViewById(R.id.alarme_nome_tratamento);
        nomeRemedio = (TextView) v.findViewById(R.id.alarme_nome_remedio);
        horarioRemedio = (TextView) v.findViewById(R.id.alarme_horario_remedio);

        nomeTratamento.setText(listAlerta.get(position).getTratamento().getNome());
        nomeRemedio.setText(listAlerta.get(position).getTratamento().getMedicamento().getNome());
        horarioRemedio.setText(listAlerta.get(position).getHorarioString());

        v.setTag(listAlerta.get(position).getId());

        return v;
    }

    @Override
    public CharSequence[] getAutofillOptions()
    {
        return new CharSequence[0];
    }
}
