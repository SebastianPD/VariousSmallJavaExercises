/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author Sebastian
 */
public class Trees {
    
    private class Node{
        int data;
        Node Left;
        Node Right;
        
        
        Node(int data){
            this.data = data;
        }
        
         private void dis(){
            System.out.println(data);
            System.out.println(Left);
            System.out.println(Right);
           
        }
    
    
    }
    Node root;
    Node Child;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Trees t = new Trees();
       t.insert(10);
       t.insert(20);
       t.insert(5);
       t.insert(3);
       
       t.Display();
    }
    
    public void insert(int value){
      Node n = new Node(value);
        
     if(root == null){
        root = n;
        Child = n;
      }
     
     if (root != null)  {
        if (value <= root.data){
            if(root.Left == null){
                root.Left = n;
                Child = root.Left;
            }else{
               
               Child.Left = n;
               insert(value); 
            }
        
        }else{
            if(root.Right == null){
                root.Right = n;
                Child =root.Right;
            }else{
                
                root=Child;
               insert(value); 
            }
        }
    
     }
   
    }
    
     private void Display(){
        Node p = root;
        
        while(root != null){
           
            p.dis();
            
            if (p.Left == null){
            
                System.out.println("null");
                break;
            }
          
            p = p.Left;
           
        
        }
    
    }
    
}
