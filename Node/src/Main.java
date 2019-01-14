
public class Main {

    public class Node {
        int data;
        Node next;
        Node Previous;

        public Node(int data){
            this.data=data;
        }

        public void display(){

            System.out.println("Node with value "+data+" Previous is " + Previous.data +" Next is " + next.data);
        }
    }

    Node Top;
    Node Bottom;

    public static void main(String[] args) {
        Main M = new Main();
        M.add(1);
        M.add(2);
        M.add(3);
       // M.remove(3);
        M.add(4);
        M.dis();
    }

    public void add(int data){
        Node n = new Node(data);
        if (Top == null){
            Top = n;
            Bottom = n;

        } else {

            n.Previous = Bottom;
            Bottom = n;
            n.Previous.next = n;

        }

    }

    public void dis(){
        Node n = Top;
        while (n != null){

            if (n == Top){
                System.out.println("Node with value "+n.data+" Previous is null" +" Next is " + n.next.data);
                n = n.next;
            }else if (n==Bottom){
                System.out.println("Node with value "+n.data+" Previous is " + n.Previous.data +" Next is null");
                n = n.next;
            }else {
                n.display();
                n = n.next;
            }

        }


    }

    public void remove(int data){
        Node n = Top;
        while(n != null){

            if(Top.data == data){
                Top.next.Previous = null;
                Top = Top.next;

            }
            if(Bottom.data == data){
                Bottom.Previous.next = null;
               Bottom =  Bottom.Previous;

            }
            if (n.data == data){
                n.Previous.next = n.next;
                n.next.Previous = n.Previous;
                System.out.println("Removed "+data);
                break;
            }
            n = n.next;

        }
        if(n == null){
            System.out.println("Nothing");

        }


    }



}
