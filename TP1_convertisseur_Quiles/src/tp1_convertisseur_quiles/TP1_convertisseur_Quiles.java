/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_quiles;

import java.util.Scanner;

/**
 *
 * @author camsq
 */
public class TP1_convertisseur_Quiles {

    /**
     * @param args the command line arguments
     */
    public static double CelciusVersKelvin (double tCelcius) { 
        double tKelvin;
        tKelvin = tCelcius+273;
        return tKelvin ;
    }
    public static double KelvinVersCelcius (double tKelvin) { 
        double tCelcius;
        tCelcius = tKelvin-273;
        return tCelcius;  
    }
    public static double FarenheitVersCelcius (double tFaren) { 
        double tCelcius;
        tCelcius = tFaren+17;
        return tCelcius;  
    }
    public static double CelciusVersFarenheit (double tCelcius) { 
        double tFaren;
        tFaren = tCelcius-17;
        return tFaren;  
    }
    public static double KelvinVersFarenheit (double tKelvin) { 
        double tFaren;
        tFaren = tKelvin-255;
        return tFaren;  
    }
    public static double FarenheitVersKelvin (double tFaren) { 
        double tKelvin;
        tKelvin = tFaren-255;
        return tKelvin;  
    }
    public static void main(String[] args) {
        double var;
        Scanner sc = new Scanner(System.in); 
        System.out.println("BO=onjour, entrer un deuxieme nombre");
        var=sc.nextDouble();
        System.out.println(CelciusVersKelvin(var));

    }
    
}
