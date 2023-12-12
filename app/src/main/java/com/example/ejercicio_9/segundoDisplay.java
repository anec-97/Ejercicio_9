package com.example.ejercicio_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class segundoDisplay extends AppCompatActivity {
    Button btnCambiarDisplay2;
    EditText edEdadDisplay2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_display);
        btnCambiarDisplay2 = (Button) findViewById(R.id.button2);
        edEdadDisplay2 = (EditText) findViewById(R.id.editTextText2);

        btnCambiarDisplay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edEdadDisplay2.getText() .toString() .equals("UTCH")){
                    Intent intent2 = new Intent(segundoDisplay.this,MainActivity.class);
                    startActivity(intent2);
                }
                else {
                    Toast.makeText(segundoDisplay.this, "Error psw",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}