package com.example.listviewtarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MoreActivity extends AppCompatActivity {

    Button btnShare;
    TextView txtName, txtReceta, txtTipoM;
    ImageView imgComida;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
       int tipo = Integer.parseInt(getIntent().getStringExtra("tipo"));
        btnShare = findViewById(R.id.btnShare);
        txtName = findViewById(R.id.txtName);
        txtReceta = findViewById(R.id.txtReceta);
        txtTipoM = findViewById(R.id.txtTipoM);
        imgComida = findViewById(R.id.imgMore);

       txtName.setText(getIntent().getStringExtra("name"));
       txtReceta.setText(getIntent().getStringExtra("receta"));
       int imgID = Integer.parseInt(getIntent().getStringExtra("foto"));
        imgComida.setImageResource(imgID);

switch (tipo){
    case 1:
        txtTipoM.setText("Tipo: Desayuno");
        break;
    case 2:
        txtTipoM.setText("Tipo: Almuerzo");
        break;
    case 3:
        txtTipoM.setText("Tipo: Cena");
        break;
    case 4:
        txtTipoM.setText("Tipo: Aperitivo");
        break;
    case 5:
        txtTipoM.setText("Tipo: Postre");
        break;
}


        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
String texto;

texto = "Mira Esta Genial Receta:\n\n "+ txtReceta.getText().toString();
                Intent i = new Intent();
                i.setAction(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT, texto);


                i.setType("*/*");
            
                startActivity(Intent.createChooser(i, "send"));

            }
        });

    }


}