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
    private boolean cheval;

    public Guerrier(String nom, int nivVie, boolean cheval) {
        super(nom, nivVie);
        this.cheval = cheval;
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }

    @Override
    public String toString() {
        return "Guerrier : " + nom + " | Vie = " + nivVie +
               " | À cheval = " + cheval;
    }
}
