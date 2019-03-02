package com.example.lenovo.catalogo;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = UsuarioEntity.class ,version=1)
public abstract class DBUsuario extends RoomDatabase {
    public abstract DAO dao();
}
