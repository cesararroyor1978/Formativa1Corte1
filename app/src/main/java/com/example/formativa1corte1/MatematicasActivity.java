package com.example.formativa1corte1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MatematicasActivity extends AppCompatActivity {
    private EditText x1EditText;
    private EditText y1EditText;
    private EditText x2EditText;
    private EditText y2EditText;
    private Button calcularButton1;
    private TextView resultadoTextView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas);

        x1EditText = findViewById(R.id.x1EditText);
        y1EditText = findViewById(R.id.y1EditText);
        x2EditText = findViewById(R.id.x2EditText);
        y2EditText = findViewById(R.id.y2EditText);
        calcularButton1 = findViewById(R.id.calcularButton1);
        resultadoTextView1 = findViewById(R.id.resultadoTextView1);

        calcularButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x1 = Double.parseDouble(x1EditText.getText().toString());
                double y1 = Double.parseDouble(y1EditText.getText().toString());
                double x2 = Double.parseDouble(x2EditText.getText().toString());
                double y2 = Double.parseDouble(y2EditText.getText().toString());

                double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

                resultadoTextView1.setText("La distancia entre los dos puntos es: " + distancia);
            }
        });
    }
}
