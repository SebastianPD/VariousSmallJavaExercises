/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author Sebastian
 */
public class BinaryTree {
    
    Node root;
    
    public void addNode(int key, String name){
        Node n = new Node(key, name);
        
        if(root == null){
            root = n;
        
        } else {
            Node focusNode = root;
            
            Node parent;
            
            while(true){
                parent = focusNode;
                
                if(key < focusNode.Key){
                    focusNode = focusNode.leftChild;
                    
                    if(focusNode == null){
                        parent.leftChild = n;
                        return;
                    }
                
                } else {
                    focusNode = focusNode.RightChild;
                    
                    if(focusNode == null){
                        parent.RightChild = n;
                        return;
                    }
                
                }
            }
        
        }
    
    }
    
    public void inOrderTraverseTree(Node focusNode){
        
        if(focusNode != null){
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.RightChild);
        }
    
    
    }
     public void preOrderTraverseTree(Node focusNode){
        
        if(focusNode != null){
            System.out.println(focusNode);
            preOrderTraverseTree(focusNode.leftChild);
            preOrderTraverseTree(focusNode.RightChild);
        }
    
    
    }
      public void postOrderTraverseTree(Node focusNode){
        
        if(focusNode != null){
            postOrderTraverseTree(focusNode.leftChild);
            postOrderTraverseTree(focusNode.RightChild);
            System.out.println(focusNode);
        }
    
    
    }
      public Node findNode(int key){
          Node focusNode = root;
          while(focusNode.Key != key){
              if(key < focusNode.Key){
                  focusNode = focusNode.leftChild;
              } else {
                  focusNode = focusNode.RightChild;
              }
              if(focusNode == null){
                  return null;
              }
          }
          return focusNode;
      }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinaryTree B = new BinaryTree();
        
        B.addNode(50, "Boss");
        B.addNode(25, "Manager");
        B.addNode(75, "Manager2");
        B.addNode(13, "Worker");

        B.inOrderTraverseTree(B.root);
        
        System.out.println("Find 25");
        System.out.println(B.findNode(25));
    }
    
         
    
    class Node{
        int Key;
        String name;
        
        Node leftChild;
        Node RightChild;
        
        Node(int key, String name){
            this.Key = key;
            this.name = name;
        }
        
        public String toString(){
        return name + " has a key " + Key;
    }
    
    
    }
    
    
}
