package com.example.lenovo.catalogo;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.arch.persistence.room.Room;


public class Principal extends Activity {
 public static DBUsuario miDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

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
        FragUsu miFragmento=new FragUsu();
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







}