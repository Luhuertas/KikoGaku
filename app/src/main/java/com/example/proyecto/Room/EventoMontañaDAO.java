package com.example.proyecto.Room;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface EventoMontañaDAO {
    @Query("SELECT * FROM eventoMontañaEntity")
    List<EventoMontañaEntity> getAll();
}
