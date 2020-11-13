package com.isa56.quiz2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class FirstQuestionActivity extends AppCompatActivity {

    public Button prox1;
    public Button respUm1;
    public Button respUm2;
    public TextView texto1;
    public int pontuacao = 0;
    Intent i = getIntent();
    String nome = i.getStringExtra("nome");

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstquestion);

        prox1 = findViewById(R.id.prox1);
        respUm1 = findViewById(R.id.botao1a);
        respUm2 = findViewById(R.id.botao1b);
        texto1 = findViewById(R.id.texto1);

        respUm1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                texto1.setText("Resposta errada!");
                respUm1.setEnabled(false);
                respUm2.setEnabled(false);
                prox1.setEnabled(true);
            }});
        respUm2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                texto1.setText("Resposta certa!");
                respUm2.setEnabled(false);
                respUm1.setEnabled(false);
                pontuacao += 1;
                prox1.setEnabled(true);
            }});
        prox1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FirstQuestionActivity.this, SecondQuestionActivity.class);
                i.putExtra("pontos", pontuacao);
                i.putExtra("nome", nome);
                startActivity(i);
            }
        });
    }
}
