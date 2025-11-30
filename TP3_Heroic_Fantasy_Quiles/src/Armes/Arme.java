/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author camsq
 */
public class Arme {
    String nom;
    int niv;
    
    public Arme(String nom, int niv) {
        this.nom = nom;
        if (niv <= 100)
            this.niv = niv;
        else
            this.niv = 100;  
    }
    public int Getniv() {
        return niv;
    }
    public String getNom() {
        return nom;
    }
     @Override
    public String toString() {
        return "\n "+ nom + " Niveau : " + niv;
    }
    
}
