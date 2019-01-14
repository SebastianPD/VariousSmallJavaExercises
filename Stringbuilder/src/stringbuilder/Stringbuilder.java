/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuilder;

/**
 *
 * @author Sebastian
 */




public class Stringbuilder {
    
    // this is to show you a new way of making stings using the sring builder technique
    // you have your set strings or ints and you put it together in the the string builder
    // 
    
    public void doSB(){
        StringBuilder sb = new StringBuilder();
        int oct1 = 192;
        int oct2 = 168;
        int oct3 = 1;
        String dot = ".";
        for (int i = 0; i < 255; i++) {
            sb.append(oct1);
            sb.append(dot);
            sb.append(oct2);
            sb.append(dot);
            sb.append(oct3);
            sb.append(dot);
            sb.append(i);
            // This stuff above made it connect together
            System.out.println(sb);
            // prints it out
            sb.setLength(0);
            //resets becuase we are in a for loop fo you have to set sb to o for it to be resued.
        }
    
    }
}

// fori + TAB key to make a for loop
// sout + TAB key to make a print statment;

class sbc {
//use shift f6
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Stringbuilder().doSB();
        // TODO code application logic here
    }
}
    


