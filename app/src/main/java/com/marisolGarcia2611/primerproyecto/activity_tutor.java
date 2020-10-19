package com.marisolGarcia2611.primerproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class activity_tutor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor);
        findViewById(R.id.btt4);

    }
    public void impli(View view)
    {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("tel"+":8718877289")));
    }
}