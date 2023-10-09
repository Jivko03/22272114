/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sedmica1_2;

import java.util.Scanner;

/**
 *
 * @author X270
 */
public class Sedmica1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float chis;
        double prev = 0;
        double end = 0;
        do
        {
           chis = sc.nextFloat();
           chis = chis*2;
           end = end + chis;
           if(chis > 0)
           {
           System.out.printf("Result: %,.2f",end);
           }
           else{System.out.println("Negative number");}
        }
        while(chis>0); 
    }
    
}
