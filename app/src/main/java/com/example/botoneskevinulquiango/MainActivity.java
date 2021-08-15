package com.example.botoneskevinulquiango;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declaracion de variables globales
    private EditText editTextPrimerValor;
    private EditText editTextSegundoValor;
    private TextView textViewResulatado;
    private RadioButton radioButtonSuma;
    private RadioButton radioButtonResta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Programacion
        //R es la clase qye logra la communion con la parte de deseño
        editTextPrimerValor = (EditText) findViewById(R.id.txt_PrimerValor);
        editTextSegundoValor = (EditText) findViewById(R.id.txt_SegundoValor);
        textViewResulatado = (TextView) findViewById(R.id.txtView_Resultado);
        radioButtonSuma = (RadioButton) findViewById(R.id.rb_sumar);
        radioButtonResta = (RadioButton) findViewById(R.id.rb_restar);


    }
    // Metodos
    public void calcular(View view) {
        double valor1 = Double.parseDouble(editTextPrimerValor.getText().toString());
        double valor2 = Double.parseDouble(editTextSegundoValor.getText().toString());
        double resultadoDouble = 0;

        if (radioButtonSuma.isChecked()){
            resultadoDouble = suma(valor1,valor2);
        }else if(radioButtonResta.isChecked()){
            resultadoDouble = resta(valor1,valor2);
        }


        String resultado = String.valueOf(resultadoDouble);
        textViewResulatado.setText(resultado);

    }


    public double suma(double valor1,double valor2){
        return valor1 + valor2;
    }

    public double resta(double valor1,double valor2){
        return valor1 - valor2;
    }
}