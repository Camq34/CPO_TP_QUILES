/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

/**
 *
 * @author camsq
 */
public class Guerrier extends Personnage {
    private boolean aCheval;

    public Guerrier(String nom, int vie, boolean cheval) {
        super(nom, vie);
        this.aCheval = cheval;
        nbGuerriers++;
    }

    public void setACheval(boolean c) { 
        this.aCheval = c; 
    }

    public void attaquer(Personnage cible) {
        if (armeEnMain == null) return;

        int degats = armeEnMain.Getniv();

        if (armeEnMain instanceof Armes.Epee e)
            degats *= e.getfinesse();

        if (aCheval) degats /= 2;

        cible.estAttaque(degats);
        this.seFatiguer();
    }
}
