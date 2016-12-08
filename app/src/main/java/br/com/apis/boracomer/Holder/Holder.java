package br.com.apis.boracomer.Holder;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import br.com.apis.boracomer.R;

/**
 * Created by ivina on 06/12/2016.
 */
public class Holder extends RecyclerView.ViewHolder {

    public TextView tvNome;
    public TextView tvHorario;
    public TextView tvData;
    public TextView tvDescricao;

    public Holder(View itemView) {
        super(itemView);
        tvNome = (TextView) itemView.findViewById(R.id.tvNome);
        tvHorario = (TextView) itemView.findViewById(R.id.tvHorario);
        tvData = (TextView) itemView.findViewById(R.id.tvData);
        tvDescricao = (TextView) itemView.findViewById(R.id.tvDescricao);
    }


}
