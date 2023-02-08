package com.example.turistiando;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    //ATRIBUTOS

    ImageButton botonHoteles;
    ImageButton botonRestaurante;

    //METODOS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar barra=getSupportActionBar();

        //cambiando el color del actionbar
        ColorDrawable colorBarra=new ColorDrawable(Color.parseColor("#FF4A4A"));
        barra.setBackgroundDrawable(colorBarra);

        //asociando los botones a eventos de click (escuchar click ome)
        botonHoteles=findViewById(R.id.iconohotel);
        botonRestaurante=findViewById(R.id.iconorestaurante);

        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentHoteles = new Intent(MainActivity.this,Hoteles.class);
                startActivity(intentHoteles);

            }
        });

        botonRestaurante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentHoteles = new Intent(MainActivity.this,Restaurantes.class);
                startActivity(intentHoteles);

            }
        });

    }

    //metodo para cambiar el idioma de mi app
    public void cambiarIdioma(String idioma){

        //configurando el lenguaje del telefono
        Locale lenguaje=new Locale(idioma);
        Locale.setDefault(lenguaje);

        //configuracion global en el telefono
        Configuration configuracionTelefono=getResources().getConfiguration();
        configuracionTelefono.locale=lenguaje;

        //ejecutamos la configuracion
        getBaseContext().getResources().updateConfiguration(configuracionTelefono,getBaseContext().getResources().getDisplayMetrics());
    }



    //Cargar el menu xml creado previamente
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;

    }


    //DAR funcionamiento al menu
    public boolean onOptionsItemSelected(MenuItem item) {

        //observamos a que item del menu le damos clic
        int itemSeleccionado=item.getItemId();

        switch(itemSeleccionado){

            case(R.id.opcion1):
                Intent intentA=new Intent(MainActivity.this,Acercade.class);
                startActivity(intentA);
                break;
            case(R.id.opcion2):
                this.cambiarIdioma("EN");
                Intent intent1=new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent1);
                break;
            case(R.id.opcion3):
                this.cambiarIdioma("ES");
                Intent intent2=new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent2);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}