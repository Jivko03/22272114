/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sedmica1;

import java.util.Scanner;

/**
 *
 * @author X270
 */
public class Sedmica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float orhidei = (float) 13.25;
        int zumbiuli = 5;
        float rozi = (float) 8.50;
        int kaktus = 8;
        int laleta = 3;
        System.out.println("Бр.Орхидеи: ");
        int brorhi= sc.nextInt();
        System.out.println("Бр.Зюмбюли: ");
        int brzum= sc.nextInt();
        System.out.println("Бр.Рози: ");
        int brroz = sc.nextInt();
        System.out.println("Бр.Кактуси: ");
        int brkak= sc.nextInt();
        System.out.println("Бр.Лалета: ");
        int brlal= sc.nextInt();
        System.out.println("Цена на телефона: ");
        float telefon = sc.nextFloat();
        float obsht = orhidei*brorhi+zumbiuli*brzum+rozi*brroz+kaktus*brkak+laleta*brlal;
        double lihva = obsht - (obsht*0.07);
        double ostatuk = lihva - telefon;
        if(ostatuk > 0)
        {
            System.out.println("She will be left with "+ostatuk);
        }
        else
        {
            System.out.println("She will have to borrow "+ostatuk);
        }
    }
    
}
