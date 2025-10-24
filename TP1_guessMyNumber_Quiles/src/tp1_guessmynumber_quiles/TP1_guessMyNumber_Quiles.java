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
    Scanner sc = new Scanner(System.in);
    System.out.println("""
                       Choisit une difficult\u00e9 : 
                       1-facile 
                       2-moyen
                       3-difficile
                       4-cauchemar""");
    int dif=sc.nextInt();
    switch (dif) {
        case 1:
            {
                System.out.println("Tu as autant de tentative que tu veux...");
                System.out.println("Essaye...");
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
                }       System.out.println("TROUVERRRR");
                System.out.println("Tentative="+comp);
                break;
            }
        case 2:
            {
                System.out.println("tu as 5 tentatives");
                System.out.println("Essaye...");
                int nbr=sc.nextInt();
                int comp=1;
                while (comp<=5) {
                    comp +=1;
                    if (n>nbr){
                        System.out.println("trop petit");
                        System.out.println("Essaye encore...");
                        nbr=sc.nextInt();
                    }
                    else if (n==nbr){
                        System.out.println("TRouVER");
                    }
                    else{
                        System.out.println("Trop grand ");
                        System.out.println("Essaye encore...");
                        nbr=sc.nextInt();
                    }
                }       System.out.println("Perdu");
                break;
            }
        case 3:
            {
                System.out.println("Devine le nombre sachant que 1/4 les indices sont faux");
                System.out.println("Essaye...");
                int nbr=sc.nextInt();
                int comp=1;
                while (n!=nbr) {
                    comp +=1;
                    if (n>nbr){
                        int CHC = generateurAleat.nextInt(4);
                        if (CHC<=3){
                            System.out.println("trop petit");
                        }
                        else{
                            System.out.println("trop grand");
                        }
                        System.out.println("Essaye encore...");
                        nbr=sc.nextInt();
                    }
                    else {
                        int CHC = generateurAleat.nextInt(4);
                        if (CHC<=3){
                            System.out.println("trop grand");
                        }
                        else{
                            System.out.println("trop petit");
                        }
                        System.out.println("Essaye encore...");
                        nbr=sc.nextInt();
                    }
                }       System.out.println("TROUVERRRR");
                System.out.println("Tentative="+comp);
                break;
            }
        case 4:
            {
                System.out.println("Devine le nombre sachant que 1/2 les indices sont faux");
                System.out.println("Essaye...");
                int nbr=sc.nextInt();
                int comp=1;
                while (n!=nbr) {
                    comp +=1;
                    if (n>nbr){
                        int CHC = generateurAleat.nextInt(2);
                        if (CHC==1){
                            System.out.println("trop petit");
                        }
                        else{
                            System.out.println("trop grand");
                        }
                        System.out.println("Essaye encore...");
                        nbr=sc.nextInt();
                    }
                    else {
                        int CHC = generateurAleat.nextInt(2);
                        if (CHC==1){
                            System.out.println("trop grand");
                        }
                        else{
                            System.out.println("trop petit");
                        }
                        System.out.println("Essaye encore...");
                        nbr=sc.nextInt();
                    }
                }       System.out.println("TROUVERRRR");
                System.out.println("Tentative="+comp);
                break;
            }
        default:
            break;
    }
}
