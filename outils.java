/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice7;

import java.util.Scanner;

/**
 *
 * @author loic
 */
public class outils {
     
    public static String ask(String question){
        System.out.println(question);
        Scanner scan = new Scanner(System.in);
        String result = scan.nextLine();
        
        return result;
    }
    public static double askDouble(String question){
        double value;
        try{
            value = Double.parseDouble(ask(question));
        }
        catch(Exception e){
            value = askDouble("Entrer un nombre!");
        }
        return value;
    }
    
    public static int askInt(String question){
        int value;
        try{
            value = Integer.parseInt(ask(question));
        }
        catch(Exception e){
            value = askInt("Entrer un nombre!");
        }
        return value;
    }
    
    public static Byte askByte(String question){
        Byte monByte = (byte) askIntBetween(question, 0, 127);
        return monByte;
    }
    
    public static int askIntBetween(String question, int min, int max){
        int monInt = askInt(question); 
        if (monInt <= max && monInt >= min) {
            return monInt;
        } else {
            return askIntBetween("On a dit entre "+min+" et "+max+"!!!", min, max);
        }
    }
    
    public static int[] bubbleSortIntArray(int[] tableau){
        int i = 0;
	Boolean changed = true;
	while (i < tableau.length- 1 && changed)
	{
		changed = false;
		for (int index = 0;  index < tableau.length-1; index++)
		{
			if (tableau[index] > tableau[index+1])
			{ 
				changed = true;
				int temp = tableau[index];
				tableau[index] = tableau[index + 1];
				tableau[index+1] = temp;
			}
		}
		i++;
	}
        return tableau;
    }
}
