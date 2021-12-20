package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Declarar variables para escuchar los controles
    EditText txtNro1, txtNro2, txtResultado;
    Button btnSumar, btnRestar, btnMultiplicar, btnDividir, btnPotencia, btnFactorial, btnSeno, btnTangente, btnBorrar, btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Leer los numeros
        txtNro1 = findViewById(R.id.txtNro1);
        txtNro2 = findViewById(R.id.txtNro2);
        txtResultado = findViewById(R.id.txtResultado);
        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        btnPotencia = findViewById(R.id.btnPotencia);
        btnFactorial = findViewById(R.id.btnFactorial);
        btnSeno = findViewById(R.id.btnSeno);
        btnTangente = findViewById(R.id.btnTangente);
        btnBorrar = findViewById(R.id.btnBorrar);
        btnSalir = findViewById(R.id.btnSalir);
        //Crear el evento sumar
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nro1 = Double.valueOf(txtNro1.getText().toString());
                double nro2 = Double.valueOf(txtNro2.getText().toString());
                double suma = nro1 + nro2;
                txtResultado.setText(String.valueOf(suma));
            }
        });
        //Crear el evento resta
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nro1  = Double.valueOf(txtNro1.getText().toString());
                double nro2 = Double.valueOf(txtNro2.getText().toString());
                double resta = nro1 - nro2;
                txtResultado.setText(String.valueOf(resta));
            }
        });
        //Crear evento multiplicacion
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nro1 = Double.valueOf(txtNro1.getText().toString());
                double nro2 = Double.valueOf(txtNro2.getText().toString());
                double multiplicacion = nro1 * nro2;
                txtResultado.setText(String.valueOf(multiplicacion));
            }
        });
        //Crear evento dividir
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nro1 = Double.valueOf(txtNro1.getText().toString());
                double nro2 = Double.valueOf(txtNro2.getText().toString());
                double division = nro1 / nro2;
                txtResultado.setText(String.valueOf(division));
            }
        });
        //Crear evento Potencia
        btnPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nro1 = Double.valueOf(txtNro1.getText().toString());
                double nro2 = Double.valueOf(txtNro2.getText().toString());
                double potencia = 1;
                for (int i = 1; i <= nro2; i++){
                    potencia = potencia * nro1;
                }
                txtResultado.setText(String.valueOf(potencia));
            }
        });
        //Crear evento factorial
        btnFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer nro = Integer.valueOf(txtNro1.getText().toString());
                Integer fact = 1;
                for (int i = 1; i <= nro ; i++ )
                    fact = fact * i;
                txtResultado.setText(String.valueOf(fact));
            }
        });
        //Crear evento seno
        btnSeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num = Double.valueOf(txtNro1.getText().toString());
                float resultado = (float) Math.sin(Math.PI*num/180);
                txtResultado.setText(String.valueOf(resultado));
            }
        });
        //Crear evento tangente
        btnTangente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num = Double.valueOf(txtNro1.getText().toString());
                float resultado = (float) Math.tan(Math.toRadians(num));
                txtResultado.setText(String.valueOf(resultado));
            }
        });
        //Crear evento borrar
        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNro1.setText("");
                txtNro2.setText("");
                txtResultado.setText("");
            }
        });
        //Crear evento salir
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}