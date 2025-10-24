/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_quiles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author camsq
 */
public class TP1_guessMyNumber_Quiles {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    Random generateurAleat = new Random(); 
    int n = generateurAleat.nextInt(100);
    System.out.println("Essaye...");
    Scanner sc = new Scanner(System.in);
    int nbr=sc.nextInt();
    int comp=1;
    while (n!=nbr) {
    comp +=1;
    if (n>nbr){
        System.out.println("trop petit");
        System.out.println("Essaye encore...");
        nbr=sc.nextInt();
    }  
    else {
        System.out.println("Trop grand ");
        System.out.println("Essaye encore...");
        nbr=sc.nextInt();
    }
    }
    System.out.println("TROUVERRRR");
    System.out.println("Tentative="+comp);
    }
    
}
