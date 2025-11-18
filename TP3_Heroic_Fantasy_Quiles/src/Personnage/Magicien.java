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

    public Magicien(String nom, int nivVie, boolean confirme) {
        super(nom, nivVie);
        this.confirme = confirme;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    @Override
    public String toString() {
        return "Magicien : " + nom + " | Vie = " + nivVie +
               " | Confirmé = " + confirme;
    }
}
    

