package com.example.turistiando;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador2 extends RecyclerView.Adapter<Adaptador2.viewHolder> {

    //atributos de la clase adaptador2
    public ArrayList<Restaurante> listaRestaurantes;

    //constructor


    public Adaptador2(ArrayList<Restaurante> listaHoteles) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @NonNull
    @Override
    public Adaptador2.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador2.viewHolder viewHolder, int i) {

        viewHolder.actualizarDatos(listaRestaurantes.get(i));


    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView fotoHotel;
        TextView nombreHotel;
        TextView precioHotel;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoHotel=itemView.findViewById(R.id.fotoHotel);
            nombreHotel=itemView.findViewById(R.id.nombreHotel);
            precioHotel=itemView.findViewById(R.id.precioHotel);
        }

        public void actualizarDatos(Restaurante restaurante) {

            fotoHotel.setImageResource(restaurante.getFotografia());
            nombreHotel.setText(restaurante.getNombre());
            precioHotel.setText(restaurante.getPrecio());

        }
    }
}