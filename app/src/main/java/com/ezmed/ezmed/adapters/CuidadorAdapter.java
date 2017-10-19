package com.ezmed.ezmed.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ezmed.ezmed.R;
import com.ezmed.ezmed.classes.Cuidador;

import java.util.List;

/**
 * Created by Monster on 19/10/2017.
 */

public class CuidadorAdapter extends BaseAdapter {

    private Context ctx;
    private List<Cuidador> cuidador;

    public CuidadorAdapter(Context ctx, List<Cuidador> cuidador) {
        this.ctx = ctx;
        this.cuidador = cuidador;
    }

    @Override
    public int getCount() {
        return cuidador.size();
    }

    @Override
    public Object getItem(int i) {
        return cuidador.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Cuidador c = cuidador.get(i);
        ViewHolder holder = null;

        if(view == null){
            view = LayoutInflater.from(ctx).inflate(R.layout.activity_gerenciar_cuidador,null);
            holder = new ViewHolder();
            holder.txtNome.setText(c.getNome());
            holder.txtCel.setText(c.getCel());
            holder.txtEmail.setText(c.getEmail());
            holder.txtObs.setText(c.getObservacao());
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }
        holder.txtNome.setText(c.getNome());
        holder.txtCel.setText(c.getCel());
        holder.txtEmail.setText(c.getEmail());
        holder.txtObs.setText(c.getObservacao());
        return view;
    }

    static class ViewHolder{
        TextView txtNome;
        TextView txtCel;
        TextView txtEmail;
        TextView txtObs;

    }





    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }
}
