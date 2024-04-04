package com.example.formativa1corte1;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;
    private CheckBox termsCheckBox;
    private Button loginButton;
    private Button cancelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        termsCheckBox = findViewById(R.id.termsCheckBox);
        loginButton = findViewById(R.id.loginButton);
        cancelButton = findViewById(R.id.cancelButton);

        loginButton.setEnabled(false);

        termsCheckBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            loginButton.setEnabled(isChecked);
        });

        loginButton.setOnClickListener(v -> {
            String username = usernameEditText.getText().toString();
            String password = passwordEditText.getText().toString();

            if (username.equals("Admin") && password.equals("admin123")) {
                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setMessage("Verificando credenciales...");
                progressDialog.show();

                new Handler().postDelayed(() -> {
                    progressDialog.dismiss();
                    Toast.makeText(MainActivity.this, "¡Bienvenido!", Toast.LENGTH_SHORT).show();
                }, 2000);

                Intent i = new Intent(getApplicationContext(),HomePrincipal.class);
                startActivity(i);

            } else {
                Toast.makeText(MainActivity.this, "Credenciales Incorrectas", Toast.LENGTH_SHORT).show();
            }
        });

        cancelButton.setOnClickListener(v -> {
            usernameEditText.setText("");
            passwordEditText.setText("");
            termsCheckBox.setChecked(false);
        });
    }
}
