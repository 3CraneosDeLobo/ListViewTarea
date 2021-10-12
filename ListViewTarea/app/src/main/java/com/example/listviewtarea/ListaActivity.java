package com.example.listviewtarea;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaActivity extends AppCompatActivity {

    String tipo;

    TextView txtHead, txtLista;
    ImageView imgHead;

    ListView lista;
    Adaptador adaptador;
    String caso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        tipo = getIntent().getStringExtra("tipo");

        txtHead = findViewById(R.id.txtTipo);
        txtLista = findViewById(R.id.txtLista);
        imgHead= findViewById(R.id.imgHead);

        lista = findViewById(R.id.lista);
        adaptador = new Adaptador(this, datos(tipo));
        lista.setAdapter(adaptador);
     caso = "";

        // Click Lista

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                Item xd = (Item) adapterView.getItemAtPosition(i);
                Intent intent = new Intent(ListaActivity.this, MoreActivity.class);
                int img = xd.getImgFoto();

                String title, receta, foto;
                foto = Integer.toString(img);
                title = xd.getTitle();
                receta = xd.getReceta();
intent.putExtra("foto", foto);
intent.putExtra("name", title );
                intent.putExtra("receta", receta);

                intent.putExtra("tipo", caso);
                startActivity(intent);
            }
        });

        // Fin Click Lista


        switch (tipo){
            case "Desayuno":
                caso = Integer.toString(1);
                txtHead.setText("Desayuno");
                txtLista.setText("Lista de Desayunos");
                imgHead.setImageResource(R.drawable.d0);

                break;
            case "Almuerzo":
                caso = Integer.toString(2);
                txtHead.setText("Almuerzo");
                txtLista.setText("Lista de Almuerzos");
                imgHead.setImageResource(R.drawable.a0);
                break;
            case "Cena":
                caso = Integer.toString(3);
                txtHead.setText("Cena");
                txtLista.setText("Lista de Cenas");
                imgHead.setImageResource(R.drawable.c0);
                break;
            case "Aperitivos":
                caso = Integer.toString(4);
                txtHead.setText("Aperitivos");
                txtLista.setText("Lista de Aperitivos");
                imgHead.setImageResource(R.drawable.ap0);
                break;
            case "Postres":
                caso = Integer.toString(5);
                txtHead.setText("Postres");
                txtLista.setText("Lista de Postres");
                imgHead.setImageResource(R.drawable.p0);
                break;
        }


    }

private ArrayList<Item> datos(String type){
        ArrayList<Item> data = new ArrayList<>();
        switch (type){

            case "Desayuno":
                data.add(new Item(R.drawable.d1, "Pan Tostado con Crema de Cacahuate", "Un rico pan con crema para empezar el dia","dos rebanadas de pan de centeno o pan tostado\n un plátano\n Crema de cacahuate\n Chispas de chocolate\n tres fresas en rebanadas (opcional)"));
                data.add(new Item(R.drawable.d2, "Pan Frances Casero", "Para sentirte en francia",  "4 rebanadas de pan de caja\n" +
                        "2 huevos\n" +
                        "1/4 de taza de azúcar\n" +
                        "1 cucharada de canela\n" +
                        "2 cucharadas de mantequilla\n" +
                        "1/4 cucharada de nuez moscada\n" +
                        "1 cucharada de azúcar morena\n" +
                        "1 taza de frambuesas\n" +
                        "1 taza de moras\n"));
                data.add(new Item(R.drawable.d3, "Hot Cakes Clasicos", "Cuando quieras empezar un dia clasico",  "1 huevo\n" +
                        "1 cucharada de vainilla líquida\n" +
                        "1 barra de mantequilla\n" +
                        "2 tazas de harina de trigo\n" +
                        "3 cucharadas de azúcar\n" +
                        "3 tazas de leche de vaca\n" +
                        "1/4 de bicarbonato de sodio\n" +
                        "1/2 cucharada de polvo para hornear\n" +
                        "1/4 cucharada de sal\n" +
                        "1/2 taza de fresas\n" +
                        "Dulce de leche al gusto \n"));
                data.add(new Item(R.drawable.d4, "Avena con Almendras", "Para olvidar a tu ex",  "1 manzana picada en cubitos\n" +
                        "1 taza de avena\n" +
                        "1 taza de agua\n" +
                        "1/2 taza de leche, opcional\n" +
                        "2 cucharadas de miel\n" +
                        "1/4 de cucharadita de sal\n" +
                        "canela en polvo al gusto, opcional\n"));
                data.add(new Item(R.drawable.d5, "Tostadas de Huevos con Champiñones", "Nada mejor que empezar un dia como Mario Bros", "2 rebanadas de pan\n" +
                        "4 huevos\n" +
                        "100 gramos de champiñones en rebanadas\n" +
                        "1/2 cucharada de mantequilla\n" +
                        "romero, opcional\n" +
                        "sal y pimienta al gusto\n" +
                        "1 cucharadita de aceite de oliva\n"));
                break;
            case "Almuerzo":
                data.add(new Item(R.drawable.a1, "Quesadillas vegetarianas", "Excelente para vegetarianos",  "\uF0A7\t4 tortitas de trigo\n" +
                        "\uF0A7\t2 pimientos rojos\n" +
                        "\uF0A7\t3 cebolletas\n" +
                        "\uF0A7\t1 aguacate\n" +
                        "\uF0A7\t150g de maiz en conserva\n" +
                        "\uF0A7\t2 cucharadas de cilantro fresco picado\n" +
                        "\uF0A7\t200g de queso cheddar rallado\n" +
                        "\uF0A7\t1 cucharada de chile en polvo\n"));
                data.add(new Item(R.drawable.a2, "Puerros en vinagreta", "Amargo pero delicioso",  "\uF0A7\t8 puerros\n" +
                        "\uF0A7\t2 cebolletas\n" +
                        "\uF0A7\t1 pimiento rojo\n" +
                        "\uF0A7\t1 pimiento verde\n" +
                        "\uF0A7\tUn puñadito de perejil fresco\n" +
                        "\uF0A7\tvinagre de jerez o de manzana\n" +
                        "\uF0A7\tsal y pimienta\n" +
                        "\uF0A7\taceite de oliva\n"));
                data.add(new Item(R.drawable.a3, "Empanadillas de pollo y queso al horno", "Para quienes aman las empanadas",  "\uF0A7\tObleas de masa para empanadillas (puedes encontrarlas en el supermercado)\n" +
                        "\uF0A7\tUna pechuga de polo\n" +
                        "\uF0A7\t1 cebolla\n" +
                        "\uF0A7\t1 diente de ajo\n" +
                        "\uF0A7\t1/2 pimiento rojo\n" +
                        "\uF0A7\t1/2 pimiento verde\n" +
                        "\uF0A7\t100g de queso rallado\n" +
                        "\uF0A7\t100g de queso crema\n" +
                        "\uF0A7\t1 cucharadita de tomillo\n" +
                        "\uF0A7\t1 cucharadita de orégano\n" +
                        "\uF0A7\tsal y pimienta\n" +
                        "\uF0A7\taceite de oliva"));
                data.add(new Item(R.drawable.a4, "Coliflor rebozada con cerveza", "No apto para niños",  "\uF0A7\t1 coliflor\n" +
                        "\uF0A7\t250ml de cerveza\n" +
                        "\uF0A7\t150g de harina\n" +
                        "\uF0A7\t15g de levadura química o polvos para hornear\n" +
                        "\uF0A7\tsal\n" +
                        "\uF0A7\taceite para freír"));
                data.add(new Item(R.drawable.a5, "Huevos rellenos de carne picada al horno", "Demuestra que tienes huevos comiendo este plato",  "\uF0A7\t8 huevos\n" +
                        "\uF0A7\t250g de carne picada de cerdo, ternera o mixta\n" +
                        "\uF0A7\t1/2 cebolla\n" +
                        "\uF0A7\t1 diente de ajo\n" +
                        "\uF0A7\t100ml de salsa de tomate\n" +
                        "\uF0A7\t100ml de vino blanco\n" +
                        "\uF0A7\t200g de queso rallado\n" +
                        "\uF0A7\tSal y pimienta\n" +
                        "\uF0A7\tAceite de oliva"));

                break;
            case "Cena":
                data.add(new Item(R.drawable.c1, "Brochetas de pavo y verduras a la parrilla", "Ni tengo que explicarlo",
                        "Solo tienes que coger unos tacos de carne de pavo, pollo o cerdo, insertarlos en palos de brocheta junto con verduras intercaladas, y asarlos a la parrilla. En este caso la carne es de pavo y le hemos puesto pimiento verde, y berenjena y cebolla moradas."));
                data.add(new Item(R.drawable.c2, "Pollo a la plancha con verduras al vapor", "Goku le gana",
                        "Para ir súper rápido, lo único que tienes que hacer es cocinar las verduras lavadas y cortadas con un estuche de silicona o un recipiente apto para el microondas. Para que las verduras queden al dente, basta poner un hilo de agua en el fondo, agregar por encima un hilo de aceite y especias aromáticas, y cocinar a la máxima potencia entre 5 y 10 minutos dependiendo de la textura que busques"));
                data.add(new Item(R.drawable.c3, "Brócoli con jamón, tomates secos y aceitunas", "No me gusta poner descripciones, solo prepara el plato porfis",
                        "Por un lado, lava unos ramitos de brócoli, colócalos en un recipiente para la cocción al vapor y cocínalos durante unos 5 minutos. Por otro lado, saltea en una sartén antiadherente unos taquitos de jamón serrano hasta que estén ligeramente dorados. Luego, hidrata unos tomates secos y córtalos en tiras, y corta en rodajas finas unas aceitunas negras. Y por último, mezcla todos los ingredientes."));
                data.add(new Item(R.drawable.c4, "Aguacate relleno de huevo bacon", "No lo sé Rick…",
                        "Dora ligeramente el bacon. Corta el aguacate por la mitad y extrae el hueso. Para agrandar el hueco, retira un poco de pulpa y resérvala para otro plato (para untar el pan en el desayuno...). Luego, coloca el aguacate en una fuente refractaria con una base de sal gorda para que no se vuelque. Casca un huevo en el hueco, distribuye por encima beicon y mozzarella, y hornea a 180º durante 12-15 min (hasta que el huevo se cuaje)."));
                data.add(new Item(R.drawable.c5, "Ensalada de aguacate, mango y fresas", "Agradable al paladar",
                        "Sobre una base de lechuga o brotes verdes, pon mango y fresas en taquitos, y una espiral de láminas de aguacate. Una explosión de colores, olores y sabores irresistible y súper fácil de hacer."));

                break;
            case "Aperitivos":
                data.add(new Item(R.drawable.ap1, "CORN DOGS", "CORN DOGS",
                        "\uF0A7\t10 salchichas estilo frankfurt\n" +
                                "\uF0A7\t200g de harina de trigo normal\n" +
                                "\uF0A7\t1 huevo\n" +
                                "\uF0A7\taproximadamente 1/2 vaso de leche. La cantidad exacta varía según la harina empleada\n" +
                                "\uF0A7\t1 cucharadita de sal\n" +
                                "\uF0A7\tOpcionalmente 1 cucharadita de pimentón dulce\n" +
                                "\uF0A7\t1 cucharada de levadura química o polvos para hornear\n" +
                                "\uF0A7\tAceite para freírlas\n"));
                data.add(new Item(R.drawable.ap2, "PALITOS DE QUESO", "Ricos palitos para comer cuando quieras",
                        "\uF0A7\t500g de un bloque de un queso blando, que se derrita fácilmente\n" +
                                "\uF0A7\t3 huevos\n" +
                                "\uF0A7\tpan rallado\n" +
                                "\uF0A7\tsal\n" +
                                "\uF0A7\tAceite"));
                data.add(new Item(R.drawable.ap3, "BOLITAS DE PATATA", "Para sentirte bolita",
                        "\uF0A7\t2 patatas medianas\n" +
                                "\uF0A7\t100g de mantequilla en textura de pomada (a temperatura ambiente)\n" +
                                "\uF0A7\t2 yemas de huevo\n" +
                                "\uF0A7\tharina, huevo y pan rallado, para empanarlas\n" +
                                "\uF0A7\tsal y pimienta\n" +
                                "\uF0A7\tAceite de oliva"));
                data.add(new Item(R.drawable.ap4, "SALCHICHAS ENVUELTAS EN PATATA", "Para comer con tus amigos",
                        "\uF0A7\t8 salchichas estilo frankfurt (de hot dog)\n" +
                                "\uF0A7\t1kg de patatas\n" +
                                "\uF0A7\t100g de queso rallado\n" +
                                "\uF0A7\t2 cucharadas de pan rallado\n" +
                                "\uF0A7\t1 cucharadita de orégano\n" +
                                "\uF0A7\tsal y pimienta\n" +
                                "\uF0A7\tAceite"));
                data.add(new Item(R.drawable.ap5, "BOLITAS DE ARROZ Y QUESO", "En la noche queda excelente",
                        "\uF0A7\t200g de arroz redondo\n" +
                                "\uF0A7\t2 dientes de ajo\n" +
                                "\uF0A7\t50g de mozzarella rallada\n" +
                                "\uF0A7\t50g de mozzarella fresca\n" +
                                "\uF0A7\t1 cucharadita de orégano\n" +
                                "\uF0A7\tPan rallado\n" +
                                "\uF0A7\t1 huevo\n" +
                                "\uF0A7\tSal y pimienta\n" +
                                "\uF0A7\tAceite\n"));

                break;
            case "Postres":
                data.add(new Item(R.drawable.p1, "TARTA DE CHOCOLATE SIN HORNO", "Te reto a que la pruebes no te vas a arrepentir",
                        "\uF0A7\t100g de galletas maría\n" +
                                "\uF0A7\t50g de mantequilla derretida\n" +
                                "\uF0A7\t500ml de leche\n" +
                                "\uF0A7\t250ml de nata para montar\n" +
                                "\uF0A7\t300g de chocolate\n" +
                                "\uF0A7\t100g de azúcar\n" +
                                "\uF0A7\t6 hojas de gelatina neutra (o 15g de en polvo)\n"));
                data.add(new Item(R.drawable.p2, "PASTEL DE ARROZ", "Un pastel clásico de arroz",
                        "\uF0A7\t6 huevos\n" +
                                "\uF0A7\t250g de azúcar\n" +
                                "\uF0A7\t250g de harina\n" +
                                "\uF0A7\t150g de mantequilla\n" +
                                "\uF0A7\t1l de leche\n" +
                                "\uF0A7\t1 lámina de hojaldre\n"));
                data.add(new Item(R.drawable.p3, "ARROZ CON LECHE", "Este ya lo conoces es un clásico ",
                        "\uF0A7\t100g de arroz redondo\n" +
                                "\uF0A7\t1l de leche entera\n" +
                                "\uF0A7\t1 trozo de cáscara de limón y de naranja\n" +
                                "\uF0A7\t1 rama de canela\n" +
                                "\uF0A7\tcanela en polvo\n" +
                                "\uF0A7\t70g de azúcar\n" +
                                "\uF0A7\t10g de mantequilla\n"));
                data.add(new Item(R.drawable.p4, "LECHE FRITA", "Un plato esporádico pero verdaderamente bueno ",
                        "\uF0A7\t500ml de leche\n" +
                                "\uF0A7\t200ml de leche+100g de maizena\n" +
                                "\uF0A7\tcáscaras de limón y naranja\n" +
                                "\uF0A7\t1 rama de canela\n" +
                                "\uF0A7\t3 yemas de huevo\n" +
                                "\uF0A7\t75 ó 100g de azúcar\n" +
                                "\uF0A7\t1 vainilla\n" +
                                "\uF0A7\t20g de mantequilla\n" +
                                "\uF0A7\tharina y huevos para rebozar\n" +
                                "\uF0A7\t75g de azúcar y 1 cucharadita de canela en polvo, para el final\n" +
                                "\uF0A7\tAceite\n"));
                data.add(new Item(R.drawable.p5, "TARTA DE MANZANA", "Una buena tarta para las tardes de verano",
                        "\uF0A7\t100g de galletas tipo maría\n" +
                                "\uF0A7\t50g de mantequilla\n" +
                                "\uF0A7\t6 manzanas medianas\n" +
                                "\uF0A7\t1 vaso de 200ml de leche\n" +
                                "\uF0A7\t1 vaso de 200ml de harina\n" +
                                "\uF0A7\t1/2 vaso de 200ml de azúcar\n" +
                                "\uF0A7\t150g de mermelada de melocotón o albaricoque.\n"));

                break;
        }



    return data;
    }

}