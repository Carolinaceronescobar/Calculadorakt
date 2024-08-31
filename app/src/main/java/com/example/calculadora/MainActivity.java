package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText numero1, numero2;
    Button btnSumar, btnRestar, btnMultiplicar, btnDividir;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        btnSumar = findViewById(R.id.btn_sumar);
        btnRestar = findViewById(R.id.btn_restar);
        btnMultiplicar = findViewById(R.id.btn_multiplicar);
        btnDividir = findViewById(R.id.btn_dividir);
        resultado = findViewById(R.id.resultado);


        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(numero1.getText().toString());
                int num2 = Integer.parseInt(numero2.getText().toString());
                int suma = num1 + num2;
                resultado.setText("Resultado: " + suma);
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(numero1.getText().toString());
                int num2 = Integer.parseInt(numero2.getText().toString());
                int resta = num1 - num2;
                resultado.setText("Resultado: " + resta);
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(numero1.getText().toString());
                int num2 = Integer.parseInt(numero2.getText().toString());
                int multiplicacion = num1 * num2;
                resultado.setText("Resultado: " + multiplicacion);
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(numero1.getText().toString());
                int num2 = Integer.parseInt(numero2.getText().toString());
                if (num2 != 0) {
                    int division = num1 / num2;
                    resultado.setText("Resultado: " + division);
                } else {
                    resultado.setText("Error: División por cero");
                }
            }
        });
    }
}
