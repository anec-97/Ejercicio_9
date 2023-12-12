package com.example.ejercicio_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnCambiarDisplay;
    EditText edEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCambiarDisplay = (Button) findViewById(R.id.btnDisplay1);
        edEdad = (EditText) findViewById(R.id.TextDisplay1);

        btnCambiarDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int textoEdad = Integer.parseInt(edEdad.getText().toString());
                if (textoEdad>=19)
                {
                    Intent intent = new Intent(MainActivity.this,segundoDisplay.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this,"Acceso Denegado",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}