/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_quiles;

/**
 *
 * @author camsq
 */
public class TP2_convertisseurObjet_Quiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Convertisseur conv1 = new Convertisseur();
        System.out.println("=== Convertisseur 1 ===");
        System.out.println("25 C = " + conv1.CelciusVersKelvin(25) + " K");
        System.out.println("300 K = " + conv1.KelvinVersCelcius(300) + " C");
        System.out.println("50 F = " + conv1.FarenheitVersCelcius(50) + " C");
        
        Convertisseur conv2 = new Convertisseur();
        System.out.println("\n=== Convertisseur 2 ===");
        System.out.println("10 C = " + conv2.CelciusVersFarenheit(10) + " F");
        System.out.println("280 K = " + conv2.KelvinVersFarenheit(280) + " F");
        
        System.out.println("\nResultats :");
        System.out.println("Convertisseur 1 → " + conv1.toString());
        System.out.println("Convertisseur 2 → " + conv2.toString());
    }
    
}
