package com.example.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Apprendimento extends AppCompatActivity {

    ImageButton ButtonRifasamento;
    ImageButton ButtonPercorso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apprendimento);

        ButtonRifasamento = (ImageButton) findViewById(R.id.rifasamento);
        ButtonPercorso = (ImageButton) findViewById(R.id.percorso);

        ButtonRifasamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Rifasamento");
            }
        });
        ButtonPercorso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Percorso");
            }
        });
    }
}
