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
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls", 7.0 ,"Dubuisson"); 
        uneBiere.lireEtiquette();
        
        BouteilleBiere deuxBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ; 
        deuxBiere.lireEtiquette();
        
        BouteilleBiere troisBiere = new BouteilleBiere("Heineken", 5.0, "Heineken International") ; 
        troisBiere.lireEtiquette();
        
        BouteilleBiere quatreBiere = new BouteilleBiere("Chimay Bleue", 9.0, "Abbaye de Scourmont") ; 
        quatreBiere.lireEtiquette();
        
        BouteilleBiere cinqBiere = new BouteilleBiere("Karmeliet Triple", 8.4, "Bosteels") ; 
        cinqBiere.lireEtiquette();
        
    System.out.println(uneBiere);
    }
    
    
}
