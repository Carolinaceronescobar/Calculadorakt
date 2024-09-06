package com.example.calculadora;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

//    Codigo anterior ---
//    EditText numero1, numero2;
//    Button btnSumar, btnRestar, btnMultiplicar, btnDividir;
//    TextView resultado;

    private EditText numero1, numero2;
    private TextView resultado;
    private Button btnSumar, btnRestar, btnMultiplicar, btnDividir, btnSalir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//inicializando los views
        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        resultado = findViewById(R.id.resultado);
        btnSumar = findViewById(R.id.btn_sumar);
        btnRestar = findViewById(R.id.btn_restar);
        btnMultiplicar = findViewById(R.id.btn_multiplicar);
        btnDividir = findViewById(R.id.btn_dividir);
        btnSalir= findViewById(R.id.btn_salir);

// Configuro listeners para los botones
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

        // Listener para el botón de salir
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Cierra la aplicación
            }
        });
    }

    // Método para validar campos vacíos
    private boolean validarCampos() {
        if (TextUtils.isEmpty(numero1.getText())) {
            Toast.makeText(this, "Por favor, ingrese el primer número", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(numero2.getText())) {
            Toast.makeText(this, "Por favor, ingrese el segundo número", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
