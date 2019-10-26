package com.example.myaplicationlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    //TextView tvMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //tvMensaje.findViewById(R.id.tvMensaje);

       // Bundle bundle = getIntent().getExtras();
        //String usuario = bundle.getString("usuario");
       // tvMensaje.setText("Bienvenido:" + usuario);

    }
}
