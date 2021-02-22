package com.example.newmoviezone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn =(Button)findViewById(R.id.btnNecesitasUnaCuenta);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),RegistrarUsuario.class);
                startActivity(intent);
                int a;

            }
        });
        Button bto =(Button)findViewById(R.id.btnIniciarSesion);
        bto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),EntradaMovieZone.class);
                startActivity(intent);
            }
        });


    }
}