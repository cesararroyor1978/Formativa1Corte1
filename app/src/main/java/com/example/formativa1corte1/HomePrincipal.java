package com.example.formativa1corte1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class HomePrincipal extends AppCompatActivity {
    private Button matematicasButton;
    private Button fisicaButton;
    private Button textoButton;
    private Button salirButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_principal);

        matematicasButton = findViewById(R.id.matematicasButton);
        fisicaButton = findViewById(R.id.fisicaButton);
        textoButton = findViewById(R.id.textoButton);
        salirButton = findViewById(R.id.salirButton);

        matematicasButton.setOnClickListener(v -> {
            // Abre la actividad de Matemáticas
            startActivity(new Intent(HomePrincipal.this, MatematicasActivity.class));
        });

        fisicaButton.setOnClickListener(v -> {
            // Abre la actividad de Física
            startActivity(new Intent(HomePrincipal.this, FisicaActivity.class));
        });

        textoButton.setOnClickListener(v -> {
            // Abre la actividad de Texto
            startActivity(new Intent(HomePrincipal.this, TextoActivity.class));
        });

        salirButton.setOnClickListener(v -> {
            // Cierra la aplicación
            finish();
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.mnuTemp) {
            Intent intent = new Intent(this, TemperaturaActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.mnuColores) {
            Intent intent = new Intent(this, CambiosColoresActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
