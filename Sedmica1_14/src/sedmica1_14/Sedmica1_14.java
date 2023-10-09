/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sedmica1_14;

import java.util.Scanner;

/**
 *
 * @author X270
 */
public class Sedmica1_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cifra = sc.nextInt();
        switch(cifra)
        {
            case 0: System.out.println("Nula, Zero");break;
            case 1: System.out.println("Edno, One");break;
            case 2: System.out.println("Dve, Two");break;
            case 3: System.out.println("Tri, Three");break;
            case 4: System.out.println("Chetiri, Four");break;
            case 5: System.out.println("Pet, Five");break;
            case 6: System.out.println("Shes, Six");break;
            case 7: System.out.println("Sedem, Seven");break;
            case 8: System.out.println("Osem, Eight");break;
            case 9: System.out.println("Devet, Nine");break;
            default:System.out.println("Nqma takova chislo");break;
            
        }
    }
    
}
