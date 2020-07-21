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
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegisterVillan extends AppCompatActivity {

    private EditText editNome, editCodinome, editEspecie, editHabilidade, editVulnerabilidade, editRival, editEsconderijo, editData;
    private TextView textNull;
    private RadioGroup rdGroup;
    private RadioButton rdButton;
    private static final String jump  = "\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_villan);

        editNome = findViewById(R.id.editNomeVillan);
        editCodinome = findViewById(R.id.editCodinomeVillan);
        editEspecie = findViewById(R.id.editEspecieVillan);
        editHabilidade = findViewById(R.id.editHabilidadeVillan);
        editVulnerabilidade = findViewById(R.id.editVulnerabilidadeVillan);
        editRival = findViewById(R.id.editRival);
        editEsconderijo = findViewById(R.id.editEsconderijo);
        editData = findViewById(R.id.editDataAtaque);
        rdGroup = findViewById(R.id.rdAcessoVillan);
        textNull = findViewById(R.id.textNull);
    }


    public void Register(View v) {
        int rdId = rdGroup.getCheckedRadioButtonId();
        rdButton = findViewById(rdId);
        String nome = editNome.getText().toString();
        String Codinome = editCodinome.getText().toString();
        String Especie = editEspecie.getText().toString();
        String Habilidade = editHabilidade.getText().toString();
        String Vulnerabilidade = editVulnerabilidade.getText().toString();
        String Rival = editRival.getText().toString();
        String Esconderijo = editEsconderijo.getText().toString();
        SimpleDateFormat Date = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date DataAtaque = Date.parse(editData.getText().toString());
        if(TextUtils.isEmpty(nome) || TextUtils.isEmpty(Codinome) || TextUtils.isEmpty(Especie) || TextUtils.isEmpty(Habilidade) ||
                TextUtils.isEmpty(Vulnerabilidade) || TextUtils.isEmpty(Rival) || TextUtils.isEmpty(Esconderijo) || rdId == -1) {
            textNull.setText("Campo vazio ou formato incorreto");

        }else{
            int Acesso = Integer.parseInt(rdButton.getText().toString());
                Viloes hero = new Viloes();
                hero.setNome(nome);
                hero.setCodinome(Codinome);
                hero.setEspecie(Especie);
                hero.setHabilidade(Habilidade);
                hero.setVulnerabilidade(Vulnerabilidade);
                hero.setRival(Rival);
                hero.setEsconderijo(Esconderijo);
                hero.setDataAtaques(DataAtaque);
                hero.setNivelAcesso(Acesso);
                String user = "Nome: " + hero.getNome() + jump +
                        "Codinome: " + hero.getCodinome() + jump +
                        "Espécie: " + hero.getEspecie() + jump +
                        "Habilidade: " + hero.getHabilidade() + jump +
                        "Vulnerabilidade: " + hero.getVulnerabilidade() + jump +
                        "Rival: " + hero.getRival() + jump +
                        "Esconderijo: " + hero.getEsconderijo() + jump +
                        "Data do ultimo ataque: " + Date.format(hero.getDataAtaques()) + jump +
                        "Nível de Acesso: " + hero.getNivelAcesso();
                Intent intent = new Intent(this, SucessoVilao.class);
                intent.putExtra("user", user);
                startActivity(intent);
                finish();
            }
        }catch (Exception e) {
            Toast.makeText(this, "Formato de data errado", Toast.LENGTH_LONG).show();
        }
        }

    public void Back(View view){
        Intent intent = new Intent(this, MenuPrincipal.class);
        startActivity(intent);
        finish();
    }

}