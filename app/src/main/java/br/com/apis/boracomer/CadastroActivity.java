package br.com.apis.boracomer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import br.com.apis.boracomer.model.EventoModel;

public class CadastroActivity extends AppCompatActivity {

    private Button btnCadastro;
    private EditText etIdade;
    private EditText etNome;
    private EditText etEmail;
    private EditText etSenha;

    private static final String URL_WEB_SERVER = "http://192.168.43.34" +
            ":8088/boracomer/request/usuario/addUsuario/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        btnCadastro = (Button) findViewById(R.id.btnCadastrar);

        etEmail = (EditText)findViewById(R.id.email);
        etNome = (EditText)findViewById(R.id.nome);
        etSenha = (EditText)findViewById(R.id.senha);
        etIdade = (EditText)findViewById(R.id.idade);
    }


    public void cadastrar(final View view){

        StringRequest sr = new StringRequest(Request.Method.GET, URL_WEB_SERVER +
                etNome.getText().toString()+ "/" + etSenha.getText().toString() + "/"+ etIdade.getText().toString() +
                "/" +etEmail.getText().toString(), new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                Log.d("RESPOSTA > ", response);
                Toast.makeText(CadastroActivity.this, response.toString(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(), LoginActivity.class);
                startActivity(intent);
            }
        }, new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
            error.printStackTrace();
            Toast.makeText(CadastroActivity.this, "Erro na Requisição", Toast.LENGTH_SHORT).show();
        }
    });

    sr.setRetryPolicy(new DefaultRetryPolicy(
            DefaultRetryPolicy.DEFAULT_TIMEOUT_MS,
            DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
            DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));

    RequestQueue requestQueue = Volley.newRequestQueue(view.getContext());
    requestQueue.add(sr);

}


}

