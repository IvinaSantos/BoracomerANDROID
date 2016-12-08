package br.com.apis.boracomer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import br.com.apis.boracomer.adapter.MyAdapter;
import br.com.apis.boracomer.model.EventoModel;

public class MainAct extends AppCompatActivity {


    private StaggeredGridLayoutManager gaggeredGridLayoutManager;
    public static ArrayList<EventoModel> ListaNomes = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(1, 1);
        recyclerView.setLayoutManager(gaggeredGridLayoutManager);


        MyAdapter rcAdapter = new MyAdapter(MainAct.this, ListaNomes);
        recyclerView.setAdapter(rcAdapter);

    }



}
