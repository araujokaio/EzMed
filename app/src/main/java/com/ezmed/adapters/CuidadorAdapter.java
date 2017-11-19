package com.ezmed.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ezmed.dto.Alerta;
import com.ezmed.dto.Cuidador;
import com.ezmed.ezmed.R;

import java.util.List;

/**
 * Created by kaiom on 19/11/2017.
 */

public class CuidadorAdapter extends BaseAdapter {
    private Context ctx;
    private List<Cuidador> listCuidador;
    private TextView nomeCuidador;
    private TextView telefoneCuidador;
    private TextView emailCuidador;

    public CuidadorAdapter(Context ctx, List<Cuidador> listCuidador)
    {
        this.ctx = ctx;
        this.listCuidador = listCuidador;
    }

    @Override
    public int getCount()
    {
        return listCuidador.size();
    }

    @Override
    public Object getItem(int position)
    {
        return listCuidador.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return listCuidador.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View v = View.inflate(ctx, R.layout.cuidador_row, null);

        nomeCuidador = (TextView) v.findViewById(R.id.cuidador_nome_cuidador);
        telefoneCuidador = (TextView) v.findViewById(R.id.cuidador_telefone_cuidador);
        emailCuidador = (TextView) v.findViewById(R.id.cuidador_email_cuidador);

        nomeCuidador.setText(listCuidador.get(position).getNome());
        telefoneCuidador.setText(listCuidador.get(position).getNumeroCelular());
        emailCuidador.setText(listCuidador.get(position).getEmail());

        v.setTag(listCuidador.get(position).getId());

        return v;
    }

    @Override
    public CharSequence[] getAutofillOptions()
    {
        return new CharSequence[0];
    }
}
