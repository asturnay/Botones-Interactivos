package com.danielflorez11cortez;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private LinearLayout mLayoutMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLayoutMain = findViewById(R.id.layout_main);

        Button btnAzul = findViewById(R.id.btn_azul);
        Button btnRojo = findViewById(R.id.btn_rojo);
        Button btnVerde = findViewById(R.id.btn_verde);
        Button btnAmarillo = findViewById(R.id.btn_amarillo);

        btnAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarColorFondo(Color.BLUE);
            }
        });

        btnRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarColorFondo(Color.RED);
            }
        });

        btnVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarColorFondo(Color.GREEN);
            }
        });

        btnAmarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarColorFondo(Color.YELLOW);
            }
        });
    }

    private void cambiarColorFondo(int color) {
        mLayoutMain.setBackgroundColor(color);
    }
}
