/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_quiles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author camsq
 */
public class TP1_Stats_Quiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        int[] tableau = new int[6];
        System.out.println("Entre un nombre de lance de de a simuler: ");
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int tirage = generateurAleat.nextInt(6);
            tableau[tirage]++;
        }
        System.out.println("\nRésusltats des lancers :");
        for (int j = 0; j < tableau.length; j++) {
            double pourcentage =(tableau[j]*100.0)/m;
            System.out.println("Face" + (j + 1) + ":" + tableau[j]+" donc le pourcentage pour la face "+ (j+1)+" ("+pourcentage+")");
        }
    }

}
