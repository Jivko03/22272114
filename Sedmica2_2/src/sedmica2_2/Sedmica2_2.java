/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sedmica2_2;

import java.util.Scanner;

/**
 *
 * @author X270
 */
public class Sedmica2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mas1 = new int[5];
        for(int i=0;i<mas1.length;i++){mas1[i]=sc.nextInt();}
        int[] mas2 = new int[5];
         for(int i=0;i<mas2.length;i++){mas2[i]=sc.nextInt();}
        for(int i=0;i<mas1.length;i++)
        {
            if(mas1[i]==mas2[i])
            {
                System.out.println("indeksite sa edankav");
            }
            else
            {
                System.out.println("indeksite sa razlichni");
            }
        }
    }
    
}
