package com.example.pizza.service;

import com.example.pizza.classes.Produit;
import com.example.pizza.dao.IDao;

import java.util.ArrayList;
import java.util.List;

public class PizzaService implements IDao<Produit> {
    private List<Produit> pizzas ;
    private static PizzaService instance;
    public PizzaService() {
        pizzas = new ArrayList<>();
    }

    @Override
    public boolean create(Produit o) {

        pizzas.add(o);
        return true;
    }

    @Override
    public boolean update(Produit o) {
        for (Produit i:pizzas) {
            if(i.getId()==o.getId()){
                pizzas.get(i.getId()).setDescription(o.getDescription());
                pizzas.get(i.getId()).setDuree(o.getDuree());
                pizzas.get(i.getId()).setDetaisingred(o.getDetaisingred());
                pizzas.get(i.getId()).setNbringredients(o.getNbringredients());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Produit o) {
        pizzas.remove(o);
        return true;
    }

    @Override
    public List<Produit> findAll() {
        return pizzas;
    }

    @Override
    public Produit findById(int id) {
        for(int i = 0; i < pizzas.size(); i++) {
            if(pizzas.get(i).getId() == id) {
                return pizzas.get(i);
            }
        }
        return null;
    }
    public static PizzaService getInstance() {
        if(instance == null)
            instance = new PizzaService();
        return instance;
    }
}
