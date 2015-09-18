/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcautomobile;

/**
 *
 * @author user
 */
public class Vehicule {

    String marque;
    String modele;
    double prix;

    public Vehicule(String marque, String modele, double prix) {
        this.marque = marque;
        this.modele = modele;
        this.prix = prix;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public double getPrix() {
        return prix;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
    

}
