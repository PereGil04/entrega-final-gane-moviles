package com.example.turistiando;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Locale;

public class Acercade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade);
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
                Intent intentA=new Intent(Acercade.this,Acercade.class);
                startActivity(intentA);
                break;
            case(R.id.opcion2):
                this.cambiarIdioma("EN");
                Intent intent1=new Intent(Acercade.this,Acercade.class);
                startActivity(intent1);
                break;
            case(R.id.opcion3):
                this.cambiarIdioma("ES");
                Intent intent2=new Intent(Acercade.this,Acercade.class);
                startActivity(intent2);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}