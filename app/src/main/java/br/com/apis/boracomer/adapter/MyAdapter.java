package br.com.apis.boracomer.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import br.com.apis.boracomer.Holder.Holder;
import br.com.apis.boracomer.R;
import br.com.apis.boracomer.model.EventoModel;

/**
 * Created by ivina on 06/12/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<Holder> {

    private ArrayList<EventoModel> itemListImg;
    private Context context;

    public MyAdapter(Context context, ArrayList<EventoModel> itemListImg) {
        this.context = context;
        this.itemListImg = itemListImg;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, null);
        Holder rcv = new Holder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        holder.tvNome.setText(itemListImg.get(position).getNome());
        holder.tvDescricao.setText(itemListImg.get(position).getDescricao());
        holder.tvHorario.setText(itemListImg.get(position).getHorario());
        holder.tvData.setText(itemListImg.get(position).getData());
    }

    @Override
    public int getItemCount() {
        return this.itemListImg.size();
    }

}

