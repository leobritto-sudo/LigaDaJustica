package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterHero extends AppCompatActivity {

    private EditText editNome, editCodinome, editEspecie, editHabilidade, editVulnerabilidade;
    private TextView textNull;
    private RadioGroup rdGroup;
    private RadioButton rdButton;
    private static final String jump  = "\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_hero);
        editNome = findViewById(R.id.editNome);
        editCodinome = findViewById(R.id.editCodinome);
        editEspecie = findViewById(R.id.editEspecie);
        editHabilidade = findViewById(R.id.editHabilidade);
        editVulnerabilidade = findViewById(R.id.editVulnerabilidade);
        rdGroup = findViewById(R.id.rdAcesso);
        textNull = findViewById(R.id.textNull);
    }

    public void Register(View v){
        int rdId = rdGroup.getCheckedRadioButtonId();
        rdButton = findViewById(rdId);
        String nome = editNome.getText().toString();
        String Codinome = editCodinome.getText().toString();
        String Especie = editEspecie.getText().toString();
        String Habilidade = editHabilidade.getText().toString();
        String Vulnerabilidade = editVulnerabilidade.getText().toString();

            if (TextUtils.isEmpty(nome) || TextUtils.isEmpty(Codinome) || TextUtils.isEmpty(Especie) || TextUtils.isEmpty(Habilidade)
                    || TextUtils.isEmpty(Vulnerabilidade) || rdId == -1) {
                textNull.setText("Campo vazio ou formato incorreto");
            }

                else{
            int Acesso = Integer.parseInt(rdButton.getText().toString());
                Membros hero = new Membros();
                hero.setNome(nome);
                hero.setCodinome(Codinome);
                hero.setEspecie(Especie);
                hero.setHabilidade(Habilidade);
                hero.setVulnerabilidade(Vulnerabilidade);
                hero.setNivelAcesso(Acesso);
                String user = "Nome: " + hero.getNome() + jump +
                        "Codinome: " + hero.getCodinome() + jump +
                        "Espécie: " + hero.getEspecie() + jump +
                        "Habilidade: " + hero.getHabilidade() + jump +
                        "Vulnerabilidade: " + hero.getVulnerabilidade() + jump +
                        "Nível de Acesso: " + hero.getNivelAcesso();
                Intent intent = new Intent(this, SucessoHero.class);
                intent.putExtra("user", user);
                startActivity(intent);
                finish();
            }
    }

    public void Back(View view){
        Intent intent = new Intent(this, MenuPrincipal.class);
        startActivity(intent);
        finish();
    }

}