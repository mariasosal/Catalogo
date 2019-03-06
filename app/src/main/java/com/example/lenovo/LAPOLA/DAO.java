package com.example.lenovo.LAPOLA;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

@Dao
public interface DAO {

    @Insert

    public void addUsuario(UsuarioEntity Usuario);
}
