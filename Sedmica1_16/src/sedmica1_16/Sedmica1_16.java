/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sedmica1_16;

import java.util.Scanner;

/**
 *
 * @author X270
 */
public class Sedmica1_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tochka = sc.nextInt();
        int[] tochki = new int[] {0,1,2,3,4,5,6,7,8,9};
        switch(tochka)
        {
            case 1,2,3:System.out.println(tochki[tochka]*10);break;
            case 4,5,6:System.out.println(tochki[tochka]*100);break;
            case 7,8,9:System.out.println(tochki[tochka]*1000);break;
            default:System.out.println("Greshka!");
        }
    }
    
}
