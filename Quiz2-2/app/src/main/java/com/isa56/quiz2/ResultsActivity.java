package com.isa56.quiz2;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultsActivity extends AppCompatActivity {

    public TextView resultado;
    public String pontuacaoSt;
    String nome = getIntent().getStringExtra("nome");
    int pontuacao = getIntent().getIntExtra("pontos", 0);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        resultado = findViewById(R.id.resultado);
        String s = String.valueOf(pontuacao);
        resultado.setText(nome + ", sua pontuação foi: " + s + ". \n Bom trabalho!");

    }
}
