package com.example.lenovo.catalogo;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


@Entity
public class UsuarioEntity {

    @PrimaryKey(autoGenerate = true)
    int idUsuario;

    String Usua;

    public int getIdUsuario() {
        return idUsuario;
    }


    public String getUsua() {
        return Usua;
    }

    public void setUsua(String Usua){
        this.Usua = Usua;
    }

}
