package com.example.newmoviezone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class RegistrarUsuario extends AppCompatActivity {

    private ArrayList<Usuario> listaUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_usuario);

        Button btn =(Button)findViewById(R.id.btnYatengocuenta);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),MainActivity.class);
                startActivity(intent);
            }

            public void listausuario()
            {
                String nom,con,corre,confir;
                EditText nombre=(EditText) findViewById(R.id.editTextNombreDeUsuarioR);
                EditText  contraseña=(EditText) findViewById(R.id.editTextContraseñaR);
                EditText correo=(EditText) findViewById(R.id.editTextCorreoR);
                EditText confirmar=(EditText) findViewById(R.id.editTextConfirmacionContraseñaR);
                nom=nombre.getText().toString();
                con=contraseña.getText().toString();
                corre=correo.getText().toString();
                confir=confirmar.getText().toString();
                listaUsuario= new ArrayList<Usuario>();
                listaUsuario.add(new Usuario(nom,con,corre,confir ));
            }
        });

    }
}