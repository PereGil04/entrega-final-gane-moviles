package com.example.turistiando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Restaurantes extends AppCompatActivity {

    //Atributos de la clase
    ArrayList<Restaurante> lista = new ArrayList<>();

    RecyclerView listaLogica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        listaLogica = findViewById(R.id.recycler2);
        listaLogica.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        crearListaHoteles();
        Adaptador2 adaptador = new Adaptador2(lista);
        listaLogica.setAdapter(adaptador);

    }

    public void crearListaHoteles() {

        lista.add(new Restaurante(R.drawable.res1, "Restaurante 1", "15000"));
        lista.add(new Restaurante(R.drawable.res2, "Restaurante 2", "25000"));
        lista.add(new Restaurante(R.drawable.res3, "Restaurante 3", "35000"));
        lista.add(new Restaurante(R.drawable.res4, "Restaurante 4", "45000"));

    }
}