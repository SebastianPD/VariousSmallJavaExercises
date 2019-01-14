/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addman;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class AddMan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Give me two numbers and I will add them?");
        int one = s.nextInt();
        int two = s.nextInt();
        int sum = one + two;
        System.out.println("You have " + one +" and "+ two + " and it's sum is " + sum);
    }
    
}
