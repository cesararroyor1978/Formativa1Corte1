package com.example.formativa1corte1;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TemperaturaActivity extends AppCompatActivity {
    private EditText celsiusEditText;
    private Spinner conversionSpinner;
    private Button calcularButton3;
    private TextView resultadoTextView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        celsiusEditText = findViewById(R.id.celsiusEditText);
        conversionSpinner = findViewById(R.id.conversionSpinner);
        calcularButton3 = findViewById(R.id.calcularButton3);
        resultadoTextView3 = findViewById(R.id.resultadoTextView3);

        String[] opciones = new String[]{"Farenheit", "Kelvin", "Rankine"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, opciones);
        conversionSpinner.setAdapter(adapter);

        calcularButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double celsius = Double.parseDouble(celsiusEditText.getText().toString());

                switch (conversionSpinner.getSelectedItem().toString()) {
                    case "Farenheit":
                        double farenheit = celsius * 9/5 + 32;
                        resultadoTextView3.setText(celsius + "°C = " + farenheit + "°F");
                        break;
                    case "Kelvin":
                        double kelvin = celsius + 273.15;
                        resultadoTextView3.setText(celsius + "°C = " + kelvin + "K");
                        break;
                    case "Rankine":
                        double rankine = (celsius + 273.15) * 9/5;
                        resultadoTextView3.setText(celsius + "°C = " + rankine + "°R");
                        break;
                }
            }
        });
    }
}
