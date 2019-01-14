/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ATM {

    /**
     * @param args the command line arguments
     */
    

  
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        System.out.println("How much money do you have?");
        float cash = in.nextFloat();
        System.out.println("How much money do you want to withdraw? Multiple of 5s please.");
        float withdraw = in.nextFloat();
        
        
        if (withdraw%5 == 0 && cash > (withdraw-.5) )
        {
           cash = cash - (withdraw + (float).50);
           System.out.println("Your new balance is" );
           System.out.printf("%.2f",cash);
        }
        else if (withdraw%5 > 0) 
        {
          System.out.println("That ain't a multiple of 5");
        }
        else if (cash < (withdraw-.5))
                {
                 System.out.println("You are too broke for that!");
                }
    }
    
}
