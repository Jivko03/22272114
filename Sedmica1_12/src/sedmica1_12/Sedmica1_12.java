/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sedmica1_12;

import java.util.Scanner;

/**
 *
 * @author X270
 */
public class Sedmica1_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firmime = sc.next();
        String address = sc.next();
        int firmnom = sc.nextInt();
        int faxnom = sc.nextInt();
        String web = sc.next();
        String meniger = sc.next();
        String menigime = sc.next();
        String famil = sc.next();
        int mennom = sc.nextInt();
        System.out.printf("Tova e firma %s s adres %s. Mojete da se obidete na %d ili da pisjete na %s kakto i da se obadite na %s",firmime,address,firmnom,faxnom,web,meniger);
        System.out.printf(" Menigara na firmata e %s negovia imeil e %s mje da go potarsite na %d ",menigime, famil,mennom);
    }
    
}
