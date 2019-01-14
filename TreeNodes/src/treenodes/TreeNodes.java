/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treenodes;

/**
 *
 * @author Sebastian
 */
public class TreeNodes {
    
    TreeNodes left;
    TreeNodes right;
    int data;
    
    public TreeNodes(int data){
        this.data = data;
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       TreeNodes n = new TreeNodes(10);
       n.insert(5);
       n.insert(3);
       n.insert(15);
       n.insert(12);
       n.insert(20);
       n.printInOrder();
       
       System.out.println(n.contains(1));
       
       
        /*System.out.println(n.data);
        System.out.println(n.left.data);
        System.out.println(n.left.left.data);
        System.out.println(n.right.data);
        System.out.println(n.right.left.data);
        System.out.println(n.right.right.data);*/
    }
    
    
    public void insert(int value){
        if (value <= data){
            if(left ==null){
                left = new TreeNodes(value);
            }else{
                left.insert(value);
            }
        
        } else {
            if(right ==null){
                right = new TreeNodes(value);
            }else{
                right.insert(value);
            }
        }
    
    
    }
    
    public boolean contains(int value){
        if (value == data){
            return true;
        }else if (value < data){
            if (left == null){
                return false;
            } else{
                return left.contains(value);
            }
        } else{
            if (right == null){
                return false;
            } else {
                return right.contains(value);
            }
        }
    
    }
    
    public void printInOrder(){
        if (left != null){
            left.printInOrder(); 
        }
        System.out.println(data);
        if(right != null){
            right.printInOrder();
        }
    }
    
}
