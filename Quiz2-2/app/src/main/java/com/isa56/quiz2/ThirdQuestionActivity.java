package com.isa56.quiz2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdQuestionActivity extends AppCompatActivity {

    public Button respTres1;
    public Button respTres2;
    public TextView texto3;
    public Button prox3;
    String nome = getIntent().getStringExtra("nome");
    int pontuacao = getIntent().getIntExtra("pontos", 0);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdquestion);

        prox3 = findViewById(R.id.prox3);
        respTres1 = findViewById(R.id.botao3a);
        respTres2 = findViewById(R.id.botao3b);
        texto3 = findViewById(R.id.texto3);

        respTres1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto3.setText("Resposta certa!");
                respTres1.setEnabled(false);
                respTres2.setEnabled(false);
                prox3.setEnabled(true);
                pontuacao += 1;
            }});

        respTres2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                texto3.setText("Resposta errada!");
                respTres1.setEnabled(false);
                respTres2.setEnabled(false);
                prox3.setEnabled(true);
            }});

        prox3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ThirdQuestionActivity.this, ResultsActivity.class);
                i.putExtra("pontos", pontuacao);
                i.putExtra("nome", nome);
                startActivity(i);
            }});
    }
}
