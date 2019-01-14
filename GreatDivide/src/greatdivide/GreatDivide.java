/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greatdivide;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class GreatDivide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Give me two numbers and I will Add, Subtract, Multiply, Divide, and give a remainder.");
        double one = s.nextDouble();
        double two = s.nextDouble();
        double sum1 = one + two;
        double sum2 = one - two;
        double sum3 = one * two;
        double sum4 = one / two;
        double sum5 = one % two;
        System.out.println("You have " + one +" and "+ two);
        System.out.println("Sum is "+ sum1);
        System.out.println("Difference is "+ sum2);
        System.out.println("Product is "+ sum3);
        System.out.println("Quoitent is "+ sum4);
        System.out.println("Remainder is "+ sum5);
    }
    
}
