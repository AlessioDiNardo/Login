package com.example.login;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class activity_main extends AppCompatActivity {

    ImageButton ButtonDiagnostica;
    ImageButton ButtonEsecuzione;
    ImageButton ButtonConfigura;
    ImageButton ButtonApprendimento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonDiagnostica = (ImageButton) findViewById(R.id.diagnostica);
        ButtonApprendimento = (ImageButton) findViewById(R.id.apprendimento);
        ButtonEsecuzione = (ImageButton) findViewById(R.id.esecuzione);
        ButtonConfigura = (ImageButton) findViewById(R.id.configura);


    }
}
