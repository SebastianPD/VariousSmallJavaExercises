/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Sebastian
 */
public class Stack {
    
    
    
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
    
    private Node top;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Stack S = new Stack();
       S.push(2);
       S.push(3);
       S.push(4);
       S.push(5);
       S.pop();
       S.Display();
    }
    
    
    public boolean isEmpty(){
        return top == null;
    }
    
    public int peek(){
        return top.data;
    }
    
    public void push(int data){
        Node node = new Node(data);
        node.next = top;
        top = node;
    }
    
    public int pop(){
         int data = top.data;
         top = top.next;
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
