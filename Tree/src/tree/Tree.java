/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author Sebastian
 */
public class Tree {
    
    public class node{
        node left;
        node right;
        int data;
        
        public node(int data){
            this.data = data;
        }

    }
    
    public class node2{
    
        node2 Next;
        int data;
        
        public node2(int data){
            this.data = data;
        
        }
    
    }
    
    node root;
    node2 top;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tree t = new Tree();
        
        t.add(50);
        t.add(25);
        t.add(75);
        t.add(13);
        t.add(48);
        //System.out.println(t.root.data+" "+t.root.left.data+" "+t.root.left.left.data);
        t.show(t.root);
        t.find(48);
        t.addL(t.root);
        t.dis(t.top);
        //System.out.println(t.top.data+" "+t.top.Next.data);
   }
    
    
    public void add(int data){
       node n = new node(data);
        
        if (root == null){
            root = n;
        } else {
            node Primary = root;
            
           while(Primary != null){
               if(data <= Primary.data){
                   if(Primary.left == null){
                       Primary.left = n;
                       break;
                   } else {
                       Primary = Primary.left;
                   }
                }
               
                if(data > Primary.data){
                    if(Primary.right == null){
                       Primary.right = n;
                       break;
                   } else {
                       Primary = Primary.right;
                   }
                }
               
           }
            
            
        
        }
        
        
    
    }
    
    public void addL(node n){
        while(n !=null){
            addL(n.left);
            node2 l = new node2(n.data);
            if(top == null){
                top = l;
            } else {
            
                l.Next = top;
                top = l;
            
            }
            addL(n.right);
            break; 
        
        }
       
    }
    
    public void dis(node2 t){
        
        
        while(t != null){
            
            if(t.Next == null){
                System.out.println(t.data + " next data is null");
                break;
            } else{
            
                System.out.println(t.data + " next data is " + t.Next.data);
                t = t.Next;
            }
            
           
        
        }
    
    
    }
    
    public void show(node n){
        
        // n = root;
        
        while(n !=null){
            show(n.left);
            System.out.println(n.data);
            show(n.right);
            break; 
        
        }
        
        
    
    
    }
    
    public void find(int value){
        node primary = root;
        
        
        if (primary.data == value){
            System.out.println("Found " + value );
        
        } else {
            while(primary != null) {
             if (value <= primary.data){
                 primary = primary.left;
            }
            
             if (value > primary.data){
                 primary = primary.right;
            }
             
             if (primary == null){
            System.out.println(value+"Not found");
                break;
            }
             
             if (primary.data == value){
            System.out.println("Found " + value );
                break;
            }
             
             if(primary.data != value && primary.left==null && primary.right == null){
                System.out.println(value + "Not Found");
                break;
            }
            }
        
        }
    
    
    }
    
    
    
}
