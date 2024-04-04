package com.example.formativa1corte1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FisicaActivity extends AppCompatActivity {
    private EditText masaEditText;
    private EditText aceleracionEditText;
    private Button calcularButton2;
    private TextView resultadoTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fisica);

        masaEditText = findViewById(R.id.masaEditText);
        aceleracionEditText = findViewById(R.id.aceleracionEditText);
        calcularButton2 = findViewById(R.id.calcularButton2);
        resultadoTextView2 = findViewById(R.id.resultadoTextView2);

        calcularButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double masa = Double.parseDouble(masaEditText.getText().toString());
                double aceleracion = Double.parseDouble(aceleracionEditText.getText().toString());

                double fuerza = masa * aceleracion;

                resultadoTextView2.setText("La fuerza aplicada al cuerpo es: " + fuerza + " N");
            }
        });
    }
}
