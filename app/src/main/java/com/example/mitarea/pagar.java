package com.example.mitarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pagar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagar);
    }

    public void salir(View view) {
        Intent salir = new Intent(this, MainActivity.class);
        startActivity(salir);
    }
}