package edu.alexandercd.hackatonapp;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainSplashActivity extends AppCompatActivity {
    //Variables
    public static final int segundos = 5; // tiempo a demorar
    public static final int milisegundos = segundos * 1000; // convercion
    public static final int delay = 2;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_splash);
        progressBar = (ProgressBar) findViewById(R.id.progressBar_splash_main_activity);
        progressBar.setMax(maxProgress());
        starAnimation();
    }

    public void starAnimation() {
        // cuenta regresiva a un tiempo futuro (se ejecuta N veces )
        new CountDownTimer(milisegundos, 1000) {
            //se ejecuta n-1
            @Override
            public void onTick(long millisUntilFinished) {
                // Asigna al progressBar de 0 hasta n
                progressBar.setProgress(establecerProgreso(millisUntilFinished));
            }

            // se ejecuta una vez al final
            @Override
            public void onFinish() {
                // llamando al siguiente activity
                Intent next = new Intent(MainSplashActivity.this, LoginActivity.class);
                startActivity(next);
                finish();
            }
        }.start();
    }

    public int establecerProgreso(long milliseconds) {
        // devuelve 0 hasta N
        return (int) (milliseconds * milisegundos / 1000);
    }

    public int maxProgress() {
        //devuelve el valor maximo del progressBar
        return segundos - delay;
    }
}
