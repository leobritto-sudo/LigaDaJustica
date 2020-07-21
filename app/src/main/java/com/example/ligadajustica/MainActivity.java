package com.example.ligadajustica;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public EditText editLogin, editSenha;
    public TextView textErro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editLogin = findViewById(R.id.editLogin);
        editSenha = findViewById(R.id.Password);
        textErro = findViewById(R.id.textErro);
    }

    public void logar(View v){
        Batman login = new Batman();
        String user = editLogin.getText().toString();
        String pass = editSenha.getText().toString();
        if(user.equals(login.getLogin()) && pass.equals(login.getSenha())){
            Intent intent = new Intent(this, MenuPrincipal.class);
            startActivity(intent);
            finish();
        }
        else {
            textErro.setText("Usuário ou senha incorretos");
        }

    }

    public void exit(View v){
        finish();
        System.exit(0);
    }
}