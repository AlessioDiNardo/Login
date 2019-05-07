package com.example.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Esecuzione extends AppCompatActivity {

    ImageButton ButtonPlay;
    ImageButton ButtonStop;
    ImageButton ButtonAdd;
    ImageButton ButtonRemove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esecuzione);

        ButtonPlay = (ImageButton) findViewById(R.id.buttonPlay);
        ButtonStop = (ImageButton) findViewById(R.id.buttonStop);
        ButtonAdd = (ImageButton) findViewById(R.id.buttonAdd);
        ButtonRemove = (ImageButton) findViewById(R.id.buttonRemove);

        ButtonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Play Robot");
            }
        });

        ButtonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Stop Robot");
            }
        });

        ButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Aggiungi");
            }
        });

        ButtonRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Rimuovi");
            }
        });
    }
}
