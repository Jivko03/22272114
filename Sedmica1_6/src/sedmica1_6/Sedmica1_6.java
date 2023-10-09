/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sedmica1_6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author X270
 */
public class Sedmica1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chisla = 0;
        int N = 0;
        int sbor = 0;
        int proiz = 1;
        do
        {
            N = N + 1;
            chisla = sc.nextInt();
            if(chisla>0)
            {
            sbor = sbor+chisla;
            proiz = proiz*chisla;
            }
        }
        while(-10<chisla&&chisla<10);
        System.out.printf("sbora e: "+sbor);
        System.out.printf(" prozvedenieto e: "+proiz);
        System.out.printf(" sbora e: "+N);
    }
    
}
