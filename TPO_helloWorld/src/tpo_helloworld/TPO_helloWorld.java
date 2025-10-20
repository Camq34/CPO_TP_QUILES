/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpo_helloworld;

import java.util.Scanner;

/**
 *
 * @author camsq
 */
public class TPO_helloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println( " Bonjour " ) ; 
        System.out.println("Au revoir");
        String prénom; 
        Scanner sc ; 
        sc = new Scanner (System.in) ; 
        System.out.println("Quel est votre prénom ?"); 
        prénom = sc.nextLine(); 
    }
    
}
