package com.marisolGarcia2611.primerproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.UriMatcher;
import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;


public class activity_centro extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centro);
        findViewById(R.id.btt1);
        findViewById(R.id.btt2);
        findViewById(R.id.btt3);


    }

    public void accion1(View view)
    {
        Intent ir=new Intent(this, MainActivity.class);
        startActivity(ir);
    }
    public void accion2(View view)
    {
        Intent go=new Intent(this, activity_tutor.class);
        startActivity(go);
    }
    public void accion3(View view)
    {
        Intent va=new Intent(this, activity_entrarPerfil.class);
        startActivity(va);
    }


}