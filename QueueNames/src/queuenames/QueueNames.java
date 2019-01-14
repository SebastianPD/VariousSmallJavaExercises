/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuenames;

/**
 *
 * @author Sebastian
 */
public class QueueNames {
    
    private class Node{
    
    private String name;
    private Node next;
    
    private Node(String name){
            
        this.name=name;
    
    }
    
    private void Dis(){
        System.out.println(name);
    }
    
    }
    
    Node Top;
    Node Tail;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QueueNames names = new QueueNames();
        names.add("Bill");
        names.add("Janet");
        names.add("Alex");
        names.add("Chirs");
        names.remove();
        names.DIS();
        
    }
    
    
     private boolean IsEmpty(){
       return Top == null;
     }
     
     private String peak(){
        return Top.name;
     }
     
     private void add(String data){
        Node n = new Node(data);
        
        if (Tail == null){
            Tail = n;
        } else {
            Tail.next = n;
        }
         Tail = n;
        
        if (Top == null){
            Top = n;
        }

    }
     
     private void remove(){
         String data = Top.name;
         Top = Top.next;
         
         if (Top == null){
             Tail = null;
         }
     
     }
     
     private void DIS(){
         Node N = Top;
         
         while(N != null){
             N.Dis();
             N = N.next;

         }
     
     
     }
}
