  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package line;

/**
 *
 * @author Sebastian
 */
public class Line {
    
    private class person {
        private int place;
        private person next;
        
        person(int p){
            this.place = p;
        }
        
        private void dis(){
            System.out.println(place);
        }
    
    }
    
    person first;
    person last;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Line L = new Line();
        
        L.add(1);
        L.add(2);
        L.add(3);
        L.add(4);
        L.add(5);
        L.remove();
        L.Display();
        
    }
    
    private boolean Empty(){

        return first == null;
    }
    
    private int peak(){
    return first.place;
    
    }
    
    private void add(int v){
   
        person p = new person(v);     
    if (first == null){
       first = p;
    }
    if(last==null){
        last = p; 
    }else{
       last.next = p;
        last = p;
    }
    }
    
    private void remove(){
    
       first = first.next;
    }
    
    private void Display(){
        person p = first;
        
        while(first != null){
           
            p.dis();
            
            if (p.next == null){
            
                System.out.println("null");
                break;
            }
          
            p = p.next;
           
        
        }
    
    }
    
}
