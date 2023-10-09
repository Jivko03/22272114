/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sedmica1_11;

import java.util.Scanner;

/**
 *
 * @author X270
 */
public class Sedmica1_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chis;
        do
        {
            chis = sc.nextInt();
            if(chis % 2 == 0)
            {
                System.out.println("Chisloto e chetno");
            }
            else{System.out.println("Chisloto e nechetno");}
        }
        while(chis > 0);
    }
    
}
