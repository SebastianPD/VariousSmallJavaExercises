/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) 
        {
            arr[i] = sc.nextInt();            
        }
 
        Arrays.sort(arr);
        System.out.println();
 
        for (int i = 0; i < t; i++) 
        {
            System.out.println(arr[i]);   
        }
        sc.close();   
    }  
    
    
}
