package com.example.login;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class activity_main extends AppCompatActivity {

    ImageButton ButtonDiagnostica;
    ImageButton ButtonEsecuzione;
    ImageButton ButtonConfigura;
    ImageButton ButtonApprendimento;
    ImageButton ButtonPower;
    ImageButton ButtonStanby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonDiagnostica = (ImageButton) findViewById(R.id.diagnostica);
        ButtonApprendimento = (ImageButton) findViewById(R.id.apprendimento);
        ButtonEsecuzione = (ImageButton) findViewById(R.id.esecuzione);
        ButtonConfigura = (ImageButton) findViewById(R.id.configura);
        ButtonPower = (ImageButton) findViewById(R.id.power);
        ButtonStanby = (ImageButton) findViewById(R.id.standby);

        ButtonDiagnostica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityDiagnostica();
            }
        });
        ButtonConfigura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityConfigura();
            }
        });
        ButtonApprendimento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityApprendimento();
            }
        });
        ButtonEsecuzione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityEsecuzione();
            }
        });
        ButtonPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Acceso o Spento");
            }
        });
        ButtonStanby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Standby");
            }
        });
    }

    public void openActivityDiagnostica() {
        Intent intent;
        intent = new Intent(this, Diagnostica.class);
        startActivity(intent);
    }
    public void openActivityConfigura() {
        Intent intent;
        intent = new Intent(this, Configura.class);
        startActivity(intent);
    }
    public void openActivityApprendimento() {
        Intent intent;
        intent = new Intent(this, Apprendimento.class);
        startActivity(intent);
    }
    public void openActivityEsecuzione() {
        Intent intent;
        intent = new Intent(this, Esecuzione.class);
        startActivity(intent);
    }
}
