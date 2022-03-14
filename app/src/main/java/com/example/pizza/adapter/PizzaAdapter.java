package com.example.pizza.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizza.R;
import com.example.pizza.classes.Produit;
import com.example.pizza.dao.IDao;

import java.util.ArrayList;
import java.util.List;

public class PizzaAdapter extends BaseAdapter {
    private List<Produit> pizzas;
    private LayoutInflater inflater;

    public PizzaAdapter(Activity activity,List<Produit> pizzas) {
        this.pizzas=pizzas;
        this.inflater= (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return pizzas.size();
    }

    @Override
    public Object getItem(int i) {
        return pizzas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i+1;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup parent) {
        if(convertview==null){
            convertview =inflater.inflate(R.layout.pizza_item,null);
        }
        ImageView image = convertview.findViewById(R.id.imagePizza);
        TextView titlecycle = convertview.findViewById(R.id.titlerecycle);
        TextView ingredient = convertview.findViewById(R.id.ingredient);
        TextView duree = convertview.findViewById(R.id.duree);
        TextView idv = convertview.findViewById(R.id.idinvisible);

        image.setImageResource(pizzas.get(position).getPhoto());
        titlecycle.setText(pizzas.get(position).getNom());
        ingredient.setText(String.valueOf(pizzas.get(position).getNbringredients()));
        duree.setText(pizzas.get(position).getDuree());
        idv.setText(String.valueOf(pizzas.get(position).getId()));

        return convertview;
    }
}
