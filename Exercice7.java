/*
 * -Lire les valeurs et stocker dans un tableau
 * -Tri à bulle
 * -Affichage
 */
package exercice7;
import java.util.*;
import MyDojoTools.outils;

public class Exercice7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tableau []= new int [5];
        for (int i = 0; i < tableau.length; i++) {
            tableau [i] = outils.askByte("Entrer un byte entre 0 et 127: ");
        }
        tableau = outils.bubbleSortIntArray(tableau);
        System.out.println("Voici votre tableau trié: "+Arrays.toString(tableau));
    }
}
    
