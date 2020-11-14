package com.isa56.quiz2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultsActivity extends AppCompatActivity {

    public TextView resultado;
    public String pontuacaoSt;
    public Button botao;
    public String nome;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        nome = getIntent().getStringExtra("nome");
        int pontuacao = getIntent().getIntExtra("pontos", 0);

        botao = findViewById(R.id.botaoVoltar);
        resultado = findViewById(R.id.resultado);
        String s = String.valueOf(pontuacao);
        resultado.setText(nome + ", sua pontuação foi: " + s + ". \n Bom trabalho!");

        botao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ResultsActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
