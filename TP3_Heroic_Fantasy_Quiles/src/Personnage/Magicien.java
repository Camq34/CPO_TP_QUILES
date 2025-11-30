/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

/**
 *
 * @author camsq
 */

public class Magicien extends Personnage {

    private boolean confirme;

    public Magicien(String nom, int vie, boolean confirme) {
        super(nom, vie);
        this.confirme = confirme;
        nbMagiciens++;
    }

    public void setConfirme(boolean c) { this.confirme = c; }

    @Override
    public void attaquer(Personnage cible) {
        if (armeEnMain == null) return;

        int degats = armeEnMain.getNiveauAttaque();

        if (armeEnMain instanceof armes.Baton b)
            degats *= b.getAge();

        if (confirme) degats /= 2;

        cible.estAttaque(degats);
        this.seFatiguer();
    }
}