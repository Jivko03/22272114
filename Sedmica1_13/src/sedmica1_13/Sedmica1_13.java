/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sedmica1_13;

import java.util.Scanner;

/**
 *
 * @author X270
 */
public class Sedmica1_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        float tejest = sc.nextInt();
        double lunatej = tejest * 0.17;
        System.out.printf("tejesta na lunata e %,.2fkg",lunatej);
    }
    
}
