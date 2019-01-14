/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Sebastian
 */
public class Queue {
    
    
    private static class Node {
    
    private int data;
    private Node next;
    
    private Node(int data){
        this.data=data;
    }
    
    public void display(){
        System.out.println(data);
    }
    }
    
    private Node top; //remove
    private Node tail; //add

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        q.Display();
    }
    
    public boolean isEmpty(){
        return top == null;
    
    }
    
    public int peek(){
         return top.data;
    }
    
    public void add(int data){
        Node N = new Node(data);
        if(tail != null){
            tail.next = N;
        }
        tail = N;
       if (top == null){
           top = N;
       }
                
    }
    
    public int remove() {
        int data = top.data;
        top = top.next;
        if(top == null){
            tail = null; 
        }
        
        return data;
    }
    
         public void Display(){
        Node N = top;
        
        
          
            while(N != null){
    
                
            N.display();
            
            if (N.next != null){
                
            System.out.println("Next Link: " + N.next.data);
            } else
            {
                System.out.println("Next Link: " + N.next);
            }
            N = N.next;
            System.out.println("");
            } 
        
      
    
    }
    
}
