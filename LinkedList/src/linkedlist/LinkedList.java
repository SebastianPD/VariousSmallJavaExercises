/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Sebastian
 */
public class LinkedList {
    
    public String bookName;
    public int millionsSold;
    
    public LinkedList next;
    
    public LinkedList(String bookName, int millionsSold){
        this.bookName = bookName;
        this.millionsSold = millionsSold;
    }
    
    public void display(){
        System.out.println(bookName+": "+millionsSold + ",000,000");
    }
    
    public String toString(){
    
        return bookName;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ActualLinkedList theLL = new ActualLinkedList();
        
        theLL.insertFirstLink("Fifty Shades of Gray", 20);
        theLL.insertFirstLink("Catch-22", 100);
        theLL.insertFirstLink("2001 A Space Odyssey", 250);
        theLL.insertFirstLink("The Hobbit", 50);
        
        //theLL.removeFirst();
       
        
       
        
        System.out.println(theLL.find("Catch-22").bookName + " was found.");
       // theLL.removeLink("Catch-22");
        
        theLL.Display();
        
    }
    
} /// all of this here makes the link

class ActualLinkedList {
    public LinkedList firstLink;

    public ActualLinkedList() {
        
        firstLink = null;
        
    }
    public boolean isEmpty(){
        return(firstLink == null);
    
    }
    
    public void insertFirstLink(String bookName, int millionsSold){
        LinkedList newLink = new LinkedList(bookName, millionsSold);
        newLink.next = firstLink;
        firstLink = newLink;
    }
    
    public LinkedList removeFirst(){
        LinkedList linkReference = firstLink;
        
        if(!isEmpty()){
            firstLink = firstLink.next;
        
        }else{
            System.out.println("Empty LinkedList");
        
        }
    return linkReference;
    
    }
    
    public void Display(){
        LinkedList theLink = firstLink;
        
        while(theLink != null){
            theLink.display();
            System.out.println("Next Link: " + theLink.next);
            theLink = theLink.next;
            System.out.println("");
           
        }
    
    }
    
    public LinkedList find(String bookName){
    
       LinkedList theLink = firstLink;
       
       if(!isEmpty()){
           while(theLink.bookName != bookName){
               if(theLink.next == null){
               return null;

               }else{
               
               theLink = theLink.next;
               
               }
           
           }
       
       } else {
           System.out.println("Empty Linked List");
       }
       return theLink;
    }
    
    public LinkedList removeLink(String bookName){
    
        LinkedList currentLink = firstLink;
        LinkedList previousLink = firstLink;
        
        while(currentLink.bookName != bookName){
            if(currentLink.next == null){
            return null;
            
            }else{
            
            previousLink = currentLink;
            
            currentLink = currentLink.next;
            
            }
        
        }
        if(currentLink == firstLink){
        
        firstLink = firstLink.next;
        
        }else{
        previousLink.next = currentLink.next;
        
        }
        
        return currentLink;
    }
}
