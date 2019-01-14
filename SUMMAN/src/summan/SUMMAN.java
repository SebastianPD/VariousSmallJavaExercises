/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summan;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class SUMMAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        String x = Integer.toBinaryString(t);
        
        System.out.println(x);
    }
}

