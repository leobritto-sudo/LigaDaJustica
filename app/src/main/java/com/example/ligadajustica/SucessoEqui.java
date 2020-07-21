package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SucessoEqui extends AppCompatActivity {

    private TextView textEqui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucesso_equi);
        textEqui = findViewById(R.id.textVilao);
        Bundle bundle = getIntent().getExtras();
        String stringUser = bundle.getString("user");
        textEqui.setText(stringUser);
    }

    public void Back(View view){
        Intent intent = new Intent(this, RegisterEqui.class);
        startActivity(intent);
        finish();
    }

    public void BackMain(View view){
        Intent intent = new Intent(this, MenuPrincipal.class);
        startActivity(intent);
        finish();
    }
}