package com.example.lenovo.LAPOLA;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.arch.persistence.room.Room;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lenovo.catalogo.R;


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

//Base de datos
        miDatabase  = Room.databaseBuilder(getApplicationContext(),DBUsuario.class,"ubicaciondb").allowMainThreadQueries().build();
//Abrir el fragmento principal al abrir la aplicacion
        FragmentManager miManejador=getFragmentManager();
        FragmentTransaction miTransaccion =miManejador.beginTransaction();
        FragPrincipal miFragmento=new FragPrincipal();
        miTransaccion.replace(R.id.contAct,miFragmento);
        miTransaccion.commit();

//Cambiar de fragmentos
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

    public void comprar (View v) {
        FragmentManager miManejador=getFragmentManager();
        FragmentTransaction miTransaccion =miManejador.beginTransaction();
        factura miFragmento=new factura();
        miTransaccion.replace(R.id.contAct,miFragmento);
        miTransaccion.commit();

    }


    //Guardar datos en la base de datos

    public void nuevoUsuario(View v){
        FragmentManager miManejador=getFragmentManager();
        FragmentTransaction miTransaccion =miManejador.beginTransaction();
        agregarUsu miNuevoUsuario;
        miNuevoUsuario=new agregarUsu();
        miTransaccion.replace(R.id.contAct,miNuevoUsuario);
        miTransaccion.commit();
    }
    //Tomar datos de la compra y mostrarlos en la factura
    public void facturar (View v) {
        EditText miCant1 = (EditText) findViewById(R.id.cantidad1);
        Button miCompra1=(Button) findViewById(R.id.facturar);
        TextView mi1=(TextView) findViewById(R.id.Cant1);
        int compra1 = Integer.parseInt(String.valueOf(miCant1.getText()));
        int r1=compra1;
        mi1.setText(r1);
/*
        EditText miCant2 = (EditText) findViewById(R.id.cantidad2);
        Button miCompra2=(Button) findViewById(R.id.facturar);
        TextView mi2=(TextView) findViewById(R.id.Cant2);
        int compra2 = Integer.parseInt(String.valueOf(miCant2.getText()));
        int r2=compra2;
        mi2.setText(r2);

        EditText miCant3 = (EditText) findViewById(R.id.cantidad3);
        Button miCompra3=(Button) findViewById(R.id.facturar);
        TextView mi3=(TextView) findViewById(R.id.Cant3);
        int compra3 = Integer.parseInt(String.valueOf(miCant3.getText()));
        int r3=compra3;
        mi3.setText(r3);

        EditText miCant4 = (EditText) findViewById(R.id.cantidad4);
        Button miCompra4=(Button) findViewById(R.id.facturar);
        TextView mi4=(TextView) findViewById(R.id.Cant4);
        int compra4 = Integer.parseInt(String.valueOf(miCant4.getText()));
        int r4=compra4;
        mi4.setText(r4);

        EditText miCant5 = (EditText) findViewById(R.id.cantidad5);
        Button miCompra5=(Button) findViewById(R.id.facturar);
        TextView mi5=(TextView) findViewById(R.id.Cant5);
        int compra5 = Integer.parseInt(String.valueOf(miCant5.getText()));
        int r5=compra5;
        mi5.setText(r5);

        EditText miCant6 = (EditText) findViewById(R.id.cantidad6);
        Button miCompra6=(Button) findViewById(R.id.facturar);
        TextView mi6=(TextView) findViewById(R.id.Cant6);
        int compra6 = Integer.parseInt(String.valueOf(miCant6.getText()));
        int r6=compra6;
        mi6.setText(r6);

        EditText miCant7 = (EditText) findViewById(R.id.cantidad7);
        Button miCompra7=(Button) findViewById(R.id.facturar);
        TextView mi7=(TextView) findViewById(R.id.Cant7);
        int compra7 = Integer.parseInt(String.valueOf(miCant7.getText()));
        int r7=compra7;
        mi7.setText(r7);

        EditText miCant8 = (EditText) findViewById(R.id.cantidad8);
        Button miCompra8=(Button) findViewById(R.id.facturar);
        TextView mi8=(TextView) findViewById(R.id.Cant8);
        int compra8 = Integer.parseInt(String.valueOf(miCant8.getText()));
        int r8=compra8;
        mi8.setText(r8);*/

        //Valor total de la compra
        TextView total=(TextView) findViewById(R.id.total);
         int Vltotal = (r1)*6000;
         total.setText(Vltotal+"COP");
//+r2+r3+r4+r5+r6+r7+r8
    }

}
