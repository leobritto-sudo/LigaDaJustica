package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SucessoVilao extends AppCompatActivity {

    private TextView textUserVillan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucesso_vilao);
        textUserVillan = findViewById(R.id.textVilao);
        Bundle bundle = getIntent().getExtras();
        String stringUser = bundle.getString("user");
        textUserVillan.setText(stringUser);
    }

    public void Back(View view){
        Intent intent = new Intent(this, RegisterVillan.class);
        startActivity(intent);
        finish();
    }

    public void BackMain(View view){
        Intent intent = new Intent(this, MenuPrincipal.class);
        startActivity(intent);
        finish();
    }
}