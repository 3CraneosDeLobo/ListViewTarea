package com.example.listviewtarea;

public class Item {


    private int imgFoto;
    private String title;
    private  String description;

    private String receta;


    public Item(int imgFoto, String title, String description, String receta) {
        this.imgFoto = imgFoto;
        this.title = title;
        this.description = description;
     ;
        this.receta = receta;
    }


    public int getImgFoto() {
        return imgFoto;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }



    public String getReceta() {
        return receta;
    }
}
