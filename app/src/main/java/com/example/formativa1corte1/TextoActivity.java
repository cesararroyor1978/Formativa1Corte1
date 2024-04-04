package com.example.formativa1corte1;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class TextoActivity extends AppCompatActivity {
    private EditText textoEditText;
    private CheckBox negritaCheckBox;
    private CheckBox cursivaCheckBox;
    private Button aumentarButton;
    private Button disminuirButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texto);

        textoEditText = findViewById(R.id.textoEditText);
        negritaCheckBox = findViewById(R.id.negritaCheckBox);
        cursivaCheckBox = findViewById(R.id.cursivaCheckBox);
        aumentarButton = findViewById(R.id.aumentarButton);
        disminuirButton = findViewById(R.id.disminuirButton);

        negritaCheckBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked && cursivaCheckBox.isChecked()) {
                textoEditText.setTypeface(null, Typeface.BOLD_ITALIC);
            } else if (isChecked) {
                textoEditText.setTypeface(null, Typeface.BOLD);
            } else if (cursivaCheckBox.isChecked()) {
                textoEditText.setTypeface(null, Typeface.ITALIC);
            } else {
                textoEditText.setTypeface(null, Typeface.NORMAL);
            }
        });

        cursivaCheckBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked && negritaCheckBox.isChecked()) {
                textoEditText.setTypeface(null, Typeface.BOLD_ITALIC);
            } else if (isChecked) {
                textoEditText.setTypeface(null, Typeface.ITALIC);
            } else if (negritaCheckBox.isChecked()) {
                textoEditText.setTypeface(null, Typeface.BOLD);
            } else {
                textoEditText.setTypeface(null, Typeface.NORMAL);
            }
        });

        aumentarButton.setOnClickListener(v -> {
            float textSize = textoEditText.getTextSize();
            textoEditText.setTextSize(textSize + 1);
        });

        disminuirButton.setOnClickListener(v -> {
            float textSize = textoEditText.getTextSize();
            textoEditText.setTextSize(textSize - 1);
        });
    }
}
