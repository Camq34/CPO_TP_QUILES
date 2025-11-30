/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

/**
 *
 * @author camsq
 */
  
import Armes.Arme;
import java.util.ArrayList;
import tp3_heroic_fantasy_quiles.EtreVivant;

public abstract class Personnage implements EtreVivant {

    protected String nom;
    protected int niveauVie;

    protected ArrayList<Arme> inventaire = new ArrayList<>();
    protected Arme armeEnMain = null;

    protected static int nbPersonnages = 0;
    protected static int nbMagiciens = 0;
    protected static int nbGuerriers = 0;

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        nbPersonnages++;
    }

    public int getNiveauVie() { return niveauVie; }
    public String getNom() { return nom; }

    public Arme getArmeEnMain() { return armeEnMain; }

    public void ajouterArme(Arme a) {
        if (inventaire.size() < 5) {
            inventaire.add(a);
        }
    }

    public void equiper(String nomArme) {
        for (Arme a : inventaire) {
            if (a.getNom().equalsIgnoreCase(nomArme)) {
                armeEnMain = a;
                System.out.println(nom + " a équipé " + a.getNom());
                return;
            }
        }
        System.out.println("Arme introuvable dans l’inventaire.");
    }


    public void seFatiguer() {
        niveauVie -= 10;
    }

    public boolean estVivant() {
        return niveauVie > 0;
    }

    public void estAttaque(int points) {
        niveauVie -= points;
    }

    
    public abstract void attaquer(Personnage cible);

    @Override
    public String toString() {
        return nom + " | Vie: " + niveauVie +
                " | Arme en main: " + (armeEnMain == null ? "Aucune" : armeEnMain.toString());
    }
}