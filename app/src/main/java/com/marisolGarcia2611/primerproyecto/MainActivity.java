package com.marisolGarcia2611.primerproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean suma=false;
    boolean resta=false;
    boolean multiplicación=false;
    boolean division=false;
    boolean porcentaje=false;
    String cadena="";
    double resultado=0;
    TextView proyectar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.proyectar=findViewById(R.id.lbl1);
    }
    public void concatenar(View view) {
        switch (view.getId())
        {
            case R.id.num1:
                cadena = cadena+"1";
                proyectar.setText(cadena);
                break;
            case R.id.num2:
                cadena = cadena+"2";
                proyectar.setText(cadena);
                break;
            case R.id.num3:
                cadena = cadena+"3";
                proyectar.setText(cadena);
                break;
            case R.id.num4:
                cadena = cadena+"4";
                proyectar.setText(cadena);
                break;
            case R.id.num5:
                cadena = cadena+"5";
                proyectar.setText(cadena);
                break;
            case R.id.num6:
                cadena = cadena+"6";
                proyectar.setText(cadena);
                break;
            case R.id.num7:
                cadena = cadena+"7";
                proyectar.setText(cadena);
                break;
            case R.id.num8:
                cadena = cadena+"8";
                proyectar.setText(cadena);
                break;
            case R.id.num9:
                cadena = cadena+"9";
                proyectar.setText(cadena);
                break;
            case R.id.num0:
                if (cadena!="")
                {
                    cadena = cadena+"0";
                    proyectar.setText(cadena);
                }
                else {proyectar.setText("0");}
                break;
            case R.id.punto:
                if (cadena=="")
                {
                    cadena = cadena+"0.";
                    proyectar.setText(cadena);
                }
                else
                {
                    cadena = cadena+".";
                    proyectar.setText(cadena);
                }
                break;
            default:
                break;
        }
//en un switch
    }
    public void porcentaje(View view){
        if(cadena!="") {
            if(resultado==0){
                this.resultado= Double.parseDouble(cadena);
            }else {
                this.resultado = resultado * (Double.parseDouble(cadena)*0.01);
            }
        }

        multiplicación = false;
        division = false;
        suma = false;
        resta = false;
        porcentaje=true;
        cadena = "";
        proyectar.setText("0");
    }
    public void sumar(View view)
    {
        if(cadena!="") {
            this.resultado =resultado+Double.parseDouble(cadena);
        }
        porcentaje=false;
        resta = false;
        multiplicación = false;
        division = false;
        suma = true;
        cadena = "";
        proyectar.setText("0");
    }
    public void restar(View view) {
        if(cadena!="") {
            if(resultado==0){
                this.resultado= Double.parseDouble(cadena);
            }else {
                this.resultado = resultado - Double.parseDouble(cadena);
            }
        }
        porcentaje=false;
        suma = false;
        resta = true;
        multiplicación = false;
        division = false;
        cadena = "";
        proyectar.setText("0");
    }
    public void multiplicar(View view) {
        if(resultado==0){
            this.resultado= Double.parseDouble(cadena);
        }else {
            this.resultado = resultado * Double.parseDouble(cadena);
        }
        porcentaje=false;
        suma = false;
        resta = false;
        division = false;
        multiplicación = true;
        cadena = "";
        proyectar.setText("0");
    }
    public void dividir(View view) {
        if(resultado==0){
            this.resultado= Double.parseDouble(cadena);
        }else {
            try {
                this.resultado = resultado / Double.parseDouble(cadena);
            }catch (Exception e){
                Toast.makeText(this,e.getMessage(), Toast.LENGTH_SHORT).show();
            }

        }
        porcentaje=false;
        suma = false;
        resta = false;
        multiplicación = false;
        division = true;
        cadena = "";
        proyectar.setText("0");
    }

    public void Igual(View view){
        if (suma==true)
        {
            this.resultado =resultado+Double.parseDouble(cadena);
            proyectar.setText(String.valueOf(resultado));
        }
        else if (resta==true)
        {
            this.resultado =resultado-Double.parseDouble(cadena);
            proyectar.setText(String.valueOf(resultado));
        }
        else if (multiplicación==true)
        {
            this.resultado =resultado*Double.parseDouble(cadena);
            proyectar.setText(String.valueOf(resultado));
        }
        else
        {

            if (division==true)
            {
                try {
                    this.resultado = resultado / Double.parseDouble(cadena);
                    proyectar.setText(String.valueOf(resultado));
                }catch (Exception e){
                    Toast.makeText(this,e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }else {
                this.resultado = resultado * (Double.parseDouble(cadena)*0.01);
                proyectar.setText(String.valueOf(resultado));
            }
        }

    }

    public void clear(View view)
    {

        suma=false;
        resta=false;
        multiplicación=false;
        division=false;
        cadena="";
        resultado=0;
        proyectar.setText("0");
    }


}