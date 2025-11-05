/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_quiles;

/**
 *
 * @author camsq
 */
public class TP2_manip_Quiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ; 
        Tartiflette assiette2 = new Tartiflette(600) ; 
        Tartiflette assiette3 = assiette2 ;
        assiette2= assiette1;
        assiette1=assiette3;
        
                
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ; 
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
        
        Moussaka[] Miam = new Moussaka[10];
        for (int i = 0; i < Miam.length ; i++) {
            Miam[i] = new Moussaka(500+10*i);
        }
    }
    
}
