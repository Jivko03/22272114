/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guess.the.number;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class GuessTheNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int min = 0;
        int max = 1000;
        int guesses = 0;
        int number = rand.nextInt(max - min + 1) + min;
        System.out.println(""+number);
         do {
             guesses = guesses + 1;
            System.out.print("Enter a number: ");

            if (sc.hasNextInt()) {
                int guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("Chisloto e viarno");
                    break;
                } else if (guess < number) {
                    System.out.println("Chisloto e tvarde malko");
                } else {
                    System.out.println("Chisloto e tvarde goliamo");
                }
            } else {
                sc.next();
                System.out.println("Tiabva da vavedete polojitelno chislo");
            }
        } while (guesses < 10);
         System.out.println("Svarshiha vi opitite");
        sc.close();
    }
    
}
