/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sedmica2_5;

import java.util.Arrays;

/**
 *
 * @author X270
 */
public class Sedmica2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = new int[]{3,2,3,4,2,2,4};
        Arrays.sort(a);
        for(int i = 0;i<a.length;i++)
        {
          for(int z = 1;z<i;z++){
          if(a[i]==a[z])
          {
              System.out.println(a[i]);
          }
            }
        }
    }
    
}
