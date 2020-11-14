package com.isa56.quiz2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    public EditText usuario;
    public EditText senha;
    public Button botaoLogin;
    public String nomeUsuario;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        botaoLogin = findViewById(R.id.botaoLogin);
        senha = findViewById(R.id.senha);
        usuario = findViewById(R.id.usuario);
        nomeUsuario = usuario.getText().toString();
        Log.d("nome de usuario", nomeUsuario);

        botaoLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, FirstQuestionActivity.class);
                i.putExtra("nome", nomeUsuario);
                startActivity(i);
            }});
    }
}
