/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcman;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class CalcMan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /* System.out.println(-5+8*6);
        System.out.println((55+9)%9);
        System.out.println(20+-3*5/8);
        System.out.println(5+15/3*2-8%3);*/
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
	    
	    int t;
	    t = s.nextInt();
	    
	    String arr[] = new String[t];
	    
	    for(int i = 0; i < t; i++){
	        arr[i] = s.next();
            }
	   
	    
	    for(int i =0; i < t; i++)
	        System.out.println(arr[i]);
        
    }
    
}
