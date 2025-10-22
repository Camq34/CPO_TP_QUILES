/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombreslnt_quiles;

import java.util.Scanner;

/**
 *
 * @author camsq
 */
public class TP1_manipNombreslnt_Quiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int var1;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Entrer le nombre :");  
        var1=sc.nextInt();
        int var2;
        System.out.println("entrer un deuxieme nombre");
        var2=sc.nextInt();
        System.out.println(var1+var2);
        System.out.println(var1/var2);
        System.out.println(var1%var2);
    }
    
}
