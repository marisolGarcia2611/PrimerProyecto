package com.marisolGarcia2611.primerproyecto;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class activity_perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        Bundle extras = getIntent().getExtras();
        String inputFirstName = extras.getString("firstNameString");
        String inputLastName = extras.getString("lastNameString");

        TextView showFirstName = (TextView) findViewById(R.id.show_first_name);
        TextView showLastName = (TextView) findViewById(R.id.show_last_name);

        showFirstName.setText(inputFirstName);
        showLastName.setText(inputLastName);
    }
}