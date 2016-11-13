package edu.alexandercd.hackatonapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    Button btnFacebook, btnGoogle, btnRegistro, btnIniciar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnIniciar = (Button) findViewById(R.id.btn_iniciar_sesion);
        btnFacebook = (Button) findViewById(R.id.btn_iniciar_sesion_facebook);
        btnGoogle = (Button) findViewById(R.id.btn_iniciar_sesion_google);
        btnRegistro = (Button) findViewById(R.id.btn_iniciar_sesion_registro);

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(LoginActivity.this, MenuDrawerActivity.class);
                startActivity(next);
                finish();
            }
        });
        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(LoginActivity.this, MenuDrawerActivity.class);
                startActivity(next);
                finish();
            }
        });
        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(LoginActivity.this, MenuDrawerActivity.class);
                startActivity(next);
                finish();
            }
        });
        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(LoginActivity.this, MenuDrawerActivity.class);
                startActivity(next);
                finish();
            }
        });
    }
}
