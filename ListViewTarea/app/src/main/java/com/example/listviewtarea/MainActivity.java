package com.example.listviewtarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity  {

    Spinner select;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        select = findViewById(R.id.select);
        btn = findViewById(R.id.btnN);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Entrar();
            }
        });

        String comidas[] = {"Desayuno","Almuerzo","Cena","Aperitivos","Postres"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, comidas);

        select.setAdapter(adapter);


    }


    public void Entrar(){
        String comida;
        comida = select.getSelectedItem().toString();
        Intent Enter = new Intent(this, ListaActivity.class);
        Enter.putExtra("tipo", comida);
        startActivity(Enter);



    }



}