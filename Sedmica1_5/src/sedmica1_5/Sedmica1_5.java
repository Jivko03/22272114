/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sedmica1_5;

import java.util.Scanner;

/**
 *
 * @author X270
 */
public class Sedmica1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int N = 0;
       float chisla =0;
       float average =0;
       float averagear=0;
       do
       {
           chisla = sc.nextFloat();
           average = average + chisla;
           N = N + 1;
       }
       while(chisla>0);
       averagear = average / N;
       System.out.printf("%,.2f %n",average);
       System.out.printf("%,.2f",averagear);
    }
    
    
}
