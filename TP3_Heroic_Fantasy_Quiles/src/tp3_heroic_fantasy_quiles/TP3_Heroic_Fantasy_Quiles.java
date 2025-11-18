/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_quiles;
import Armes.*;
import java.util.ArrayList;

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

        ArrayList<Arme> arsenal = new ArrayList<>();

        // Ajout des armes
        arsenal.add(excalibur);
        arsenal.add(durandal);
        arsenal.add(chene);
        arsenal.add(charme);

        // Affichage des caractéristiques des armes
        for (int i = 0; i < arsenal.size(); i++) {
            System.out.println(arsenal.get(i).toString());
    }
    
}
}
