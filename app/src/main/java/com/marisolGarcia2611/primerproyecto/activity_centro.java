package com.marisolGarcia2611.primerproyecto;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import java.awt.font.TextAttribute;

public class activity_centro extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centro);
        findViewById(R.id.btt1);
    }

    public void accion1(View view)
    {
        Intent ir=new Intent(this, MainActivity.class);
        startActivity(ir);
    }
}