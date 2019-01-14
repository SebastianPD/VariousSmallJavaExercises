/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellouser;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class HelloUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("What is your Name?");
        String name = s.next();
        System.out.println("Hello");
        System.out.println(name);
        
    }
    
}
