package com.example.turistiando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Hoteles extends AppCompatActivity {

    //Atributos de la clase
    ArrayList<Hotel> lista = new ArrayList<>();

    RecyclerView listaLogica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);

        listaLogica=findViewById(R.id.recycler);
        listaLogica.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        crearListaHoteles();
        Adaptador adaptador=new Adaptador(lista);
        listaLogica.setAdapter(adaptador);

    }

    public void crearListaHoteles(){

        lista.add(new Hotel(R.drawable.hotel1,"Hotel 1", "150000"));
        lista.add(new Hotel(R.drawable.hotel2,"Hotel 2", "250000"));
        lista.add(new Hotel(R.drawable.hotel3,"Hotel 3", "350000"));
        lista.add(new Hotel(R.drawable.hotel4,"Hotel 4", "450000"));

    }
}