/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sedmica1_10;

import java.util.Scanner;

/**
 *
 * @author X270
 */
public class Sedmica1_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ka = sc.nextInt();
        int pa = sc.nextInt();
        int pb = sc.nextInt();
        int r = sc.nextInt();
        int ta = sc.nextInt();
        int tb = sc.nextInt();
        int tc = sc.nextInt();
        double kvadrat = Math.pow(ka,2);
        double pravoag = pa * pb;
        double krag = Math.PI * r;
        double p = (ta+tb+tc)/2;
        double triagalnik = Math.sqrt(p*(p-ta)*(p-tb)*(p-tc));
        System.out.printf("Liceto na kvadrata e "+kvadrat);
        System.out.printf(" Liceto na pravoagalnik e "+pravoag);
        System.out.printf(" Liceto na krag e "+krag);
        System.out.printf(" Liceto na triagalnik e "+triagalnik);
    }
    
}
