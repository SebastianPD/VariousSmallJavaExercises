/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist2;

/**
 *
 * @author Sebastian
 */
public class LinkedList2 {
    
    
   
    public class node{
    
    int age;
    String name;
    String major;
    
    node Next;
    
    node(int age, String name, String major){
    
        this.age = age;
        this.name = name;
        this.major = major;
        
    }
    public void dis(){
        System.out.println(age+", "+name+", "+ major+ " Next person is:" + Next.name);
    
     }
    
    }
    
    node first;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList2 L = new LinkedList2();
        
        L.add(18, "Bill", "Mat Sci");
        L.add(19, "Lili", "Bio Med");
        L.add(19, "Alex", "Comp Eng");
        L.add(18, "Hannah", "Phych");
        L.add(20, "Deo", "MechE");
        L.display();
        L.find("Hannah");
        L.remove("Bill");
        L.display();
    }
    
    
    public void add(int age, String name, String major){
        // This is using a stack methond of placing people
        
        
        node N = new node(age, name, major);
        
        if (first == null){
            first = N;
        } else {
            
            
            N.Next = first;  
            first = N;
        } 
        
    
    }
    
    public void display(){
         
        node n = first;
        
        while(n != null){
        
        if (n.Next == null){
            System.out.println(n.age+", "+n.name+", "+ n.major+ " Next person is: no one");
        } else{
            n.dis();
        }
        
        n = n.Next;
        
        
        }
    
    }
    
    public void find(String name){
        node n = first;
        
        
        
        while (n.name != name){
        
            if(n.Next == null && n.name!= name){
                 System.out.println(name+" NOT FOUND");
                 break;
            }
            
            n = n.Next;
        
            if (n.name == name){
               System.out.println("FOUND " + name); 
                break;
            } 
        
        
        }
        
        
    
    }
    
    public void remove(String name){
             node n = first;
             
        if (n.name == name){
        System.out.println("Remove " + name); 
        first = n.Next;
        } else{
           
             
            while (n.name != name){
        
                 if(n.Next == null && n.name!= name){
                 System.out.println(name+" NOT FOUND");
                 break;
            }
                 
            
            
            n = n.Next;
            
            if (n.Next == null){
               // System.out.println(name+" NOT FOUND");
            
            }else if (n.Next.name == name){
                System.out.println("Remove " + name); 
                node y = n.Next;
                n.Next = y.Next;
                
                break;
            } 
        
        
            }
        }
             
    
    
    }
    
}
