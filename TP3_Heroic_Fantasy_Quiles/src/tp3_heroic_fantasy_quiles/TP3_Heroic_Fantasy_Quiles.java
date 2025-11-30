/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_quiles;
import Armes.*;
import java.util.ArrayList;
import Personnage.*;
/**
 *
 * @author camsq
 */
public class TP3_Heroic_Fantasy_Quiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);

        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        Magicien mag = new Magicien("Merlin", 60, false);
        Guerrier gur = new Guerrier("Conan", 80, true);

        mag.ajouterArme(excalibur);
        mag.ajouterArme(chene);

        gur.ajouterArme(durandal);
        gur.ajouterArme(charme);

        mag.equiper("Chêne");
        gur.equiper("Durandal");

        System.out.println("\n=== Combat ===");
        mag.attaquer(gur);
        System.out.println(mag);
        System.out.println(gur);

        gur.attaquer(mag);
        System.out.println(mag);
        System.out.println(gur);

        System.out.println("\nVivant ? Magicien: " + mag.estVivant() + ", Guerrier: " + gur.estVivant());
    }
}