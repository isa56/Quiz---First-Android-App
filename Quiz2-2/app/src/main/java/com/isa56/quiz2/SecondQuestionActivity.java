package com.isa56.quiz2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondQuestionActivity extends AppCompatActivity {

    public Button respDois1;
    public Button respDois2;
    public Button prox2;
    public TextView texto2;
    String nome = getIntent().getStringExtra("nome");
    int pontuacao = getIntent().getIntExtra("pontos", 0);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondquestion);

        prox2 = findViewById(R.id.prox2);
        respDois1 = findViewById(R.id.botao2a);
        respDois2 = findViewById(R.id.botao2b);
        texto2 = findViewById(R.id.texto2);

        respDois1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto2.setText("Resposta errada!");
                respDois1.setEnabled(false);
                respDois2.setEnabled(false);
                prox2.setEnabled(true);
            }});

        respDois2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                texto2.setText("Resposta certa!");
                respDois1.setEnabled(false);
                respDois2.setEnabled(false);
                prox2.setEnabled(true);
                pontuacao += 1;
            }});

        prox2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondQuestionActivity.this, ThirdQuestionActivity.class);
                i.putExtra("pontos", pontuacao);
                i.putExtra("nome", nome);
                startActivity(i);
            }});

    }
}
