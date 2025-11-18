/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

/**
 *
 * @author camsq
 */
public class Personnage {
  
    protected String nom;
    protected int nivVie;

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.nivVie = niveauVie;
    }

    public int getNiveauVie() {
        return nivVie;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Personnage : " + nom + " | Vie = " + nivVie;
    }
}

