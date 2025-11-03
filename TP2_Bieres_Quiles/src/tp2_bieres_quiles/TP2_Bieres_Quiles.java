/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_quiles;

/**
 *
 * @author camsq
 */
public class TP2_Bieres_Quiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson"); 
        uneBiere.ouverte= false;
        uneBiere.lireEtiquette();
        
        BouteilleBiere deuxBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ; 
        deuxBiere.ouverte=true;
        deuxBiere.lireEtiquette();
    }
    
}
