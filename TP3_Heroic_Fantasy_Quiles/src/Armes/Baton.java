/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author camsq
 */

public class Baton extends Arme {
    private int age; // < 100

    public Baton(String nom, int Att, int age) {
        super(nom, Att);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bâton : " + nom + " | Attaque = " + Att + " | Âge = " + age;
    }
}
