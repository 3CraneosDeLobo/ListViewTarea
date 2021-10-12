package com.example.listviewtarea;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {

    private Context context;
    private ArrayList<Item> listItems;

    public Adaptador(Context context, ArrayList<Item> listItems) {
        this.context = context;
        this.listItems = listItems;
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int i) {
        return listItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
      Item item = (Item) getItem(i);

        view = LayoutInflater.from(context).inflate(R.layout.lista_plantilla, null);
        ImageView imgFoto = (ImageView) view.findViewById(R.id.imgComida);
        TextView txtTitle = (TextView) view.findViewById(R.id.txtTitle);
        TextView txtDes = (TextView) view.findViewById(R.id.txtDes);

        imgFoto.setImageResource(item.getImgFoto());
        txtTitle.setText(item.getTitle());
        txtDes.setText(item.getDescription());

        return view;
    }
}
