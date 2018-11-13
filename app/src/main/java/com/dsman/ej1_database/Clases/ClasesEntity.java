package com.dsman.ej1_database.Clases;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.sql.Date;

@Entity(tableName = "Clases_table")
public class ClasesEntity {

    @PrimaryKey (autoGenerate = false)

    @ColumnInfo (name = "Nombre")
    @NonNull
    private String mClases;
    @ColumnInfo(name = "Horas Semanales")
    private  Integer mHoras;
    @ColumnInfo(name = "Profesor")
    private  String mProfesor;
    @ColumnInfo(name = "fIncio")
    private Date mDInicio;
    @ColumnInfo(name = "fFin")
    private Date mDFin;



    public ClasesEntity(@NonNull String mClases, Integer mHoras, String mProfesor, Date mDInicio, Date mDFin) {
        this.mClases = mClases;
        this.mHoras = mHoras;
        this.mProfesor = mProfesor;
        this.mDInicio = mDInicio;
        this.mDFin = mDFin;
    }

    public void setAllClases(@NonNull String mClases) {
        this.mClases = mClases;
    }
    public String getAllClases() {
        return this.mClases;
    }

    public Integer getmHoras() {
        return mHoras;
    }

    public void setmHoras(Integer mHoras) {
        this.mHoras = mHoras;
    }

    public String getmProfesor() {
        return mProfesor;
    }

    public void setmProfesor(String mProfesor) {
        this.mProfesor = mProfesor;
    }

    public Date getmDInicio() {
        return mDInicio;
    }

    public void setmDInicio(Date mDInicio) {
        this.mDInicio = mDInicio;
    }

    public Date getmDFin() {
        return mDFin;
    }

    public void setmDFin(Date mDFin) {
        this.mDFin = mDFin;
    }

}
