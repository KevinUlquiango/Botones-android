package com.example.botoneskevinulquiango;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declaracion de variables globales
    private EditText editTextPrimerValor;
    private EditText editTextSegundoValor;
    private TextView textViewResulatado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Programacion
        //R es la clase qye logra la communion con la parte de deseño
        editTextPrimerValor = (EditText) findViewById(R.id.txt_PrimerValor);
        editTextSegundoValor = (EditText) findViewById(R.id.txt_SegundoValor);
        textViewResulatado = (TextView) findViewById(R.id.txtView_Resultado);


    }
    // Metodos
    public void sumar(View view) {
        int valor1 = Integer.parseInt(editTextPrimerValor.getText().toString());
        int valor2 = Integer.parseInt(editTextSegundoValor.getText().toString());
        int suma = valor1 + valor2;

        String resultado = String.valueOf(suma);
        textViewResulatado.setText(resultado);

    }
}