/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sedmica1_4;

import java.util.Scanner;

/**
 *
 * @author X270
 */
public class Sedmica1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        float chisla;
        float average = 0;
        for(int i = 0; i<N;i++)
        {
            chisla = sc.nextFloat();
            average = average + chisla;
        }
        float averageAritmetic = average / N;
        System.out.printf("%,.2f",averageAritmetic);
    }
    
}