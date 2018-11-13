package com.dsman.ej1_database.Clases;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface ClasesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(ClasesEntity clases);




    @Query("SELECT * from Clases_table ORDER BY Nombre ASC")
    LiveData<List<ClasesEntity>> getAllClases();


}

