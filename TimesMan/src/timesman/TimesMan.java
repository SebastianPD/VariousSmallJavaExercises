/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timesman;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class TimesMan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner s = new Scanner(System.in);
          
          System.out.println("give me a number and interval and I will give you a times table for it");
          System.out.println("Number");
          int n = s.nextInt();
          System.out.println("Interval");
          int e1 = s.nextInt();
          int e2 = s.nextInt();
          
           int x = e2+1;
    
          int[] arr = new int[x];
          
           for(int i = e1; i < x; i++)
      
      {
         // arr[i] = i;
          int p = n*i;
          System.out.println(n+ " * "  +i+ " = "+p );
      }
    }
    
}
