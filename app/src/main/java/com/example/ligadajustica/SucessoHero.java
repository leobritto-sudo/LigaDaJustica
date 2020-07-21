package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SucessoHero extends AppCompatActivity {

    private TextView textHero;
    private static final String jump  = "\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucesso_hero);
        textHero = findViewById(R.id.textHero);
        Bundle bundle = getIntent().getExtras();
        String stringUser = bundle.getString("user");
        textHero.setText(stringUser);
    }

    public void Back(View view){
        Intent intent = new Intent(this, RegisterHero.class);
        startActivity(intent);
        finish();
    }

    public void BackMain(View view){
        Intent intent = new Intent(this, MenuPrincipal.class);
        startActivity(intent);
        finish();
    }
}