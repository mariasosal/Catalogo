package com.example.lenovo.catalogo;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.arch.persistence.room.Room;
import android.widget.TextView;


public class Principal extends Activity {
    //Cambiar fuente
 /*   private TextView texto1;
    private TextView texto2;

    private Typeface titulo;
    private Typeface botones;*/

 public static DBUsuario miDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        //Fuente
      /*  String fuente1="/fuentes/titulo.otf";
        this.titulo=Typeface.createFromAsset(getAssets(),fuente1);
        String fuente2="/fuentes/botones.otf";
        this.botones=Typeface.createFromAsset(getAssets(),fuente2);

        texto1 =(TextView) findViewById(R.id.text1);
        texto1.setTypeface(titulo);
        texto1 =(TextView) findViewById(R.id.text2);
        texto1.setTypeface(titulo);
        texto2=(TextView) findViewById(R.id.txtUsu1);
        texto2.setTypeface(botones);*/


        miDatabase  = Room.databaseBuilder(getApplicationContext(),DBUsuario.class,"ubicaciondb").allowMainThreadQueries().build();

        FragmentManager miManejador=getFragmentManager();
        FragmentTransaction miTransaccion =miManejador.beginTransaction();
        FragPrincipal miFragmento=new FragPrincipal();
        miTransaccion.replace(R.id.contAct,miFragmento);
        miTransaccion.commit();


    }
    public void agregarFragUsu (View v) {
        FragmentManager miManejador=getFragmentManager();
        FragmentTransaction miTransaccion =miManejador.beginTransaction();
        FragUsu miFragmento=new FragUsu();
        miTransaccion.replace(R.id.contAct,miFragmento);
        miTransaccion.commit();
    }
    public void agregarFragSis (View v) {
        FragmentManager miManejador=getFragmentManager();
        FragmentTransaction miTransaccion =miManejador.beginTransaction();
        FragSis miFragmento=new FragSis();
        miTransaccion.replace(R.id.contAct,miFragmento);
        miTransaccion.commit();
    }
    public void agregarFragCat (View v) {
        FragmentManager miManejador=getFragmentManager();
        FragmentTransaction miTransaccion =miManejador.beginTransaction();
        FragCatalogo miFragmento=new FragCatalogo();
        miTransaccion.replace(R.id.contAct,miFragmento);
        miTransaccion.commit();
    }
    public void agregarFragusuarios (View v) {
        FragmentManager miManejador=getFragmentManager();
        FragmentTransaction miTransaccion =miManejador.beginTransaction();
        usuarios miFragmento=new usuarios();
        miTransaccion.replace(R.id.contAct,miFragmento);
        miTransaccion.commit();
    }
    public void agregarFragfacturas (View v) {
        FragmentManager miManejador=getFragmentManager();
        FragmentTransaction miTransaccion =miManejador.beginTransaction();
        facturas miFragmento=new facturas();
        miTransaccion.replace(R.id.contAct,miFragmento);
        miTransaccion.commit();
    }
    public void agregarFraginventario (View v) {
        FragmentManager miManejador=getFragmentManager();
        FragmentTransaction miTransaccion =miManejador.beginTransaction();
        inventario miFragmento=new inventario();
        miTransaccion.replace(R.id.contAct,miFragmento);
        miTransaccion.commit();
    }
    public void comprar (View v) {
        FragmentManager miManejador=getFragmentManager();
        FragmentTransaction miTransaccion =miManejador.beginTransaction();
        factura miFragmento=new factura();
        miTransaccion.replace(R.id.contAct,miFragmento);
        miTransaccion.commit();
    }
    public void devolver (View v) {
        FragmentManager miManejador=getFragmentManager();
        FragmentTransaction miTransaccion =miManejador.beginTransaction();
        FragPrincipal miFragmento=new FragPrincipal();
        miTransaccion.replace(R.id.contAct,miFragmento);
        miTransaccion.commit();
    }

    public void atrasUsu (View v) {
        FragmentManager miManejador=getFragmentManager();
        FragmentTransaction miTransaccion =miManejador.beginTransaction();
        FragUsu miFragmento=new FragUsu();
        miTransaccion.replace(R.id.contAct,miFragmento);
        miTransaccion.commit();
        }
    public void atrasSis (View v) {
        FragmentManager miManejador=getFragmentManager();
        FragmentTransaction miTransaccion =miManejador.beginTransaction();
        FragSis miFragmento=new FragSis();
        miTransaccion.replace(R.id.contAct,miFragmento);
        miTransaccion.commit();
    }

    public void nuevoUsuario(View v){
        FragmentManager miManejador=getFragmentManager();
        FragmentTransaction miTransaccion =miManejador.beginTransaction();
        agregarUsu miNuevoUsuario;
        miNuevoUsuario=new agregarUsu();
        miTransaccion.replace(R.id.contAct,miNuevoUsuario);
        miTransaccion.commit();

    }







}