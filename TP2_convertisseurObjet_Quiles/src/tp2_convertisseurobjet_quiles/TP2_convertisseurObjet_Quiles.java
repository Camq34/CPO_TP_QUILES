/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_quiles;

import java.util.Scanner;

/**
 *
 * @author camsq
 */
public class TP2_convertisseurObjet_Quiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float var;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Bonjour, saisez une valeur de tempereature a convertir ");
        var= sc.nextFloat();
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :"+"\n1) De Celcius vers Kelvin"+"\n2) De Kelvin vers Celcius"+"\n3) De Farenheit Vers Celcius"+"\n4) De Celcius Vers Farenheit"+"\n5) De Kelvin Vers Farenheit"+"\n6) De Farenheit Vers Kelvin");
        Convertisseur conv1 = new Convertisseur();
        int conv=sc.nextInt();
        if (conv==1){
            System.out.println(conv1.CelciusVersKelvin(var)+"K");
        }
        else if(conv==2){
            System.out.println(conv1.KelvinVersCelcius(var)+"C");
        }        
        else if (conv==3){
            System.out.println(conv1.FarenheitVersCelcius(var)+"C");
        }
        else if (conv==4){
            System.out.println(conv1.CelciusVersFarenheit(var)+"F");
        }
        else if (conv==5){
            System.out.println(conv1.KelvinVersFarenheit(var)+"F");
        }
        else if (conv==6){
            System.out.println(conv1.FarenheitVersKelvin(var)+"K");
        }
        else {
            System.out.println("C'est pas le bon nombre");
        }
            }
    
}
