/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackoplates;

/**
 *
 * @author Sebastian
 */
public class StackOPlates {

    /**
     * @param args the command line arguments
     */
    private class Plate{
    
    private int plateNum;
    private Plate Next;
    
    Plate(int num){
        this.plateNum = num;
    }
    
    private void Dis(){
        System.out.println(plateNum);
    }
    
    }
    
    Plate Top;
    
    public static void main(String[] args) {
        // TODO code application logic here
        StackOPlates S = new StackOPlates();
        S.add(1);
        S.add(2);
        S.add(3);
        S.add(4);
        //S.Remove();
        S.Display();
        
    }
    
    
    private boolean Empty(){      
       return Top == null;
}
    
    private int peak(){
    return Top.plateNum;
    }
    
    private void add(int data){
        Plate P = new Plate(data);
        if (Top == null){
            Top = P;
        } else {
        
        P.Next = Top;
        Top = P;
        
        }
    
    }
    
    private void Remove(){
        Top = Top.Next;
    }
    
    private void Display(){
        
        Plate p = Top;
        
        while(p != null){
            p.Dis();
              
            if (p.Next == null){
                System.out.println("Null");
            }
            
            p = p.Next;
        
        }
    
    
    }
    
}
