package com.example.formativa1corte1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class CambiosColoresActivity extends AppCompatActivity {
    private RelativeLayout rLayout;
    private Button cambiarColorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambios_colores);

        rLayout = findViewById(R.id.rLayout);
        cambiarColorButton = findViewById(R.id.cambiarColorButton);

        cambiarColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
                rLayout.setBackgroundColor(color);
            }
        });
    }
}
