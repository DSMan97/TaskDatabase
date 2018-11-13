package com.dsman.ej1_database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dsman.ej1_database.Clases.ClasesRepository;
import com.dsman.ej1_database.Students.UserEntity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ClasesRepository mRepo = new ClasesRepository(getApplication());



    }
}
