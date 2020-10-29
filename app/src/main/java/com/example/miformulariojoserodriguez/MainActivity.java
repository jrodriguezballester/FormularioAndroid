package com.example.miformulariojoserodriguez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
       mostrar icono
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setIcon(R.mipmap.ic_myicono2);
       */
        Button btn = (Button) findViewById(R.id.buttonSiguiente);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), datos.class);
                startActivityForResult(intent, 0);
            }
        });

    }
}