package com.example.pizza.classes;

public class Produit {

    private int id ;
    private String nom;
    private int nbringredients ;
    private int photo;
    private String duree;
    private String detaisingred;
    private String description;
    private String preparation;
    private static int comp=0;

    public Produit(String nom, int nbringredients, int photo, String duree, String detaisingred, String description, String preparation) {
        this.id = comp;
        this.nom = nom;
        this.nbringredients = nbringredients;
        this.photo = photo;
        this.duree = duree;
        this.detaisingred = detaisingred;
        this.description = description;
        this.preparation = preparation;
        this.comp++;

    }
    public Produit() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbringredients() {
        return nbringredients;
    }

    public void setNbringredients(int nbringredients) {
        this.nbringredients = nbringredients;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getDetaisingred() {
        return detaisingred;
    }

    public void setDetaisingred(String detaisingred) {
        this.detaisingred = detaisingred;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbringredients=" + nbringredients +
                ", photo=" + photo +
                ", duree=" + duree +
                ", detaisingred='" + detaisingred + '\'' +
                ", description='" + description + '\'' +
                ", preparation='" + preparation + '\'' +
                '}';
    }
}
