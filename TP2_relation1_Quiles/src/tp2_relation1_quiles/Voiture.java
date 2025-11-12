/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation1_quiles;

/**
 *
 * @author camsq
 */
public class Voiture {
     String modele;
    String marque;
    int nbPlaces;
    Personne proprietaire; // référence vers le propriétaire

    // Constructeur
    public Voiture(String modele, String marque, int nbPlaces) {
        this.modele = modele;
        this.marque = marque;
        this.nbPlaces = nbPlaces;
        this.proprietaire = null; // initialisation à null
    }

    // toString
    public String toString() {
        return marque + " " + modele + " (" + nbPlaces + " places)";
    }
    
}
