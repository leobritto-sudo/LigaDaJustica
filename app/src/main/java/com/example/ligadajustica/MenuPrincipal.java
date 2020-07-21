package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    public void abrirHeroi(View v){
        Intent intent = new Intent(this, RegisterHero.class);
        startActivity(intent);
        finish();
    }

    public void abrirVilao(View v){
        Intent intent = new Intent(this, RegisterVillan.class);
        startActivity(intent);
        finish();
    }

    public void abrirEqui(View v){
        Intent intent = new Intent(this, RegisterEqui.class);
        startActivity(intent);
        finish();
    }

    public void logout(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}