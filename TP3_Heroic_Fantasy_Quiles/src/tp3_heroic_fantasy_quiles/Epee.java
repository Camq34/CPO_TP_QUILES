/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_quiles;

/**
 *
 * @author camsq
 */
public class Epee extends Arme{
    int finesse;
    public Epee(String nom, int niv, int fine) {
        super(nom, niv); 
        if (finesse < 100)
            this.finesse = fine;
        else
            this.finesse =99;
    }
    public int getfinesse() {
        return finesse;
    }
     @Override
    public String toString() {
        return super.toString() + " | Finesse : " + indiceFinesse;
    }
    
}
