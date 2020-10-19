package com.marisolGarcia2611.primerproyecto;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import java.awt.font.TextAttribute;

public class activity_splash extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final TextView label;
        label = findViewById(R.id.lbl2);
        new CountDownTimer(5000, 1000)
        {
            @Override
            public void onTick(long millisUntilFinished) {
                label.setText( millisUntilFinished / 1000+"%" );
            }

            @Override
            public void onFinish() {
                startActivity(new Intent(activity_splash.this,activity_centro.class));
                finish();
                label.setText("Welcome to app");


            }
        }.start();
    }
}