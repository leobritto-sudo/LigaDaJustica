package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterEqui extends AppCompatActivity {

    private EditText editNome, editDono, editDesc, editFin;
    private TextView textNull;
    private RadioGroup radioGroup;
    private RadioButton rdButton;
    private static final String jump  = "\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_equi);
        editNome = findViewById(R.id.editNomeEqui);
        editDono = findViewById(R.id.editDono);
        editDesc = findViewById(R.id.editDesc);
        radioGroup = findViewById(R.id.radioGroup);
        editFin = findViewById(R.id.editFinalidade);
        textNull = findViewById(R.id.textNull);
    }

    public void Register(View view){
        int rdId = radioGroup.getCheckedRadioButtonId();
        rdButton = findViewById(rdId);
        String nome = editNome.getText().toString();
        String dono = editDono.getText().toString();
        String desc = editDesc.getText().toString();
        String finalidade = editFin.getText().toString();
        if(TextUtils.isEmpty(nome) || TextUtils.isEmpty(desc) || TextUtils.isEmpty(finalidade) || TextUtils.isEmpty(dono)){
            textNull.setText("Campo vazio ou formato incorreto");
        }else {
            Equipamentos hero = new Equipamentos();
            hero.setNome(nome);
            hero.setDono(dono);
            hero.setDescricao(desc);
            hero.setFinalidade(finalidade);
            if(rdId == 2131230953) {
                String user = "Nome: " + hero.getNome() + jump +
                        "Dono: " + hero.getDono() + jump +
                        "Descrição: " + hero.getDescricao() + jump +
                        "Finalidade: " + hero.getFinalidade() + jump +
                        "Tipo: Herói" + jump;
                Intent intent = new Intent(this, SucessoEqui.class);
                intent.putExtra("user", user);
                startActivity(intent);
                finish();
            }else if(rdId == 2131230954){
                String user = "Nome: " + hero.getNome() + jump +
                        "Dono: " + hero.getDono() + jump +
                        "Descrição: " + hero.getDescricao() + jump +
                        "Finalidade: " + hero.getFinalidade() + jump +
                        "Tipo: Vilão" + jump;
                Intent intent = new Intent(this, SucessoEqui.class);
                intent.putExtra("user", user);
                startActivity(intent);
                finish();
            }
            else{
                Toast.makeText(this, "Indique se é herói ou vilãos", Toast.LENGTH_LONG).show();
            }
        }
    }

    public void Back(View view){
        Intent intent = new Intent(this, MenuPrincipal.class);
        startActivity(intent);
        finish();
    }
}