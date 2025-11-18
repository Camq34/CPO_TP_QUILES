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
        
        Epee e1 = new Epee("Excalibur", 7, 5);
        Epee e2 = new Epee("Durandal", 4, 7);
        Baton b1 = new Baton("Chêne", 4, 5);
        Baton b2 = new Baton("Charme", 5, 6);

        ArrayList<Arme> armes = new ArrayList<>();
        armes.add(e1);
        armes.add(e2);
        armes.add(b1);
        armes.add(b2);

        System.out.println("=== Liste des armes ===");
        for (int i = 0; i < armes.size(); i++) {
            System.out.println(armes.get(i));
        }

        Magicien m1 = new Magicien("Gandalf", 65, true);
        Magicien m2 = new Magicien("Garcimore", 44, false);
        Guerrier g1 = new Guerrier("Conan", 78, false);
        Guerrier g2 = new Guerrier("Lannister", 45, true);

        ArrayList<Personnage> persos = new ArrayList<>();
        persos.add(m1);
        persos.add(m2);
        persos.add(g1);
        persos.add(g2);

        System.out.println("\n=== Liste des personnages ===");
        for (int i = 0; i < persos.size(); i++) {
            System.out.println(persos.get(i));
        }
    }
}
