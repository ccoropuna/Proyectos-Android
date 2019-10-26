package com.example.myaplicationlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etUsuario,etClave;
    TextView tvMensajeError;
    Button btnIngresar;

    //datos de acceso
    String dataUsuario="ccoropuna";
    String dataClave="12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsuario = findViewById(R.id.etUsuario);
        etClave = findViewById(R.id.etClave);
        btnIngresar = findViewById(R.id.btnIngresar);
        tvMensajeError=findViewById(R.id.tvMensajeError);



        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = etUsuario.getText().toString();
                String clave = etClave.getText().toString();

                //validamos los datos de acceso
                if(dataUsuario.equals(usuario) && dataClave.equals(clave)){

                    Intent intent =
                            new Intent(MainActivity.this,
                                    MenuActivity.class);
                    //Inicializamos el intento
                    startActivity(intent);
                }else{
                    tvMensajeError.setText("Usuario y/o clave es incorrecto");
                    Toast.makeText(MainActivity.this,
                            "Datos invalidos",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
