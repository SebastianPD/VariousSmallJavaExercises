public class BinarySearchTree {


    public class node{

        int data;
        node left;
        node right;

        public node(int data){
            this.data = data;
        }

    }

    node root;

public static void main(String[] args) {
    BinarySearchTree t = new BinarySearchTree();
    t.add(50);
    t.add(25);
    t.add(75);
    t.add(5);
    t.add(7);

    t.display(t.root);

    t.find(5);

}

public void add(int d){
    node n = new node(d);
      if (root == null){
          root = n;
      } else {
          node prime = root;
          while (prime != null) {

              if (d <= prime.data) {

                  if(prime.left == null){
                      prime.left = n;
                      break;
                  }else{
                      prime = prime.left;
                  }

              }
              if (d > prime.data) {
                  if(prime.right == null){
                      prime.right = n;
                      break;
                  }else{
                      prime = prime.right;
                  }
              }
          }


      }

}

public void display(node n){

    while(n != null){
        display(n.left);
        System.out.println(n.data);
        display(n.right);
        break;
    }

}

public void find(int n){
    node prime = root;
    while(prime !=null) {
       if(prime.data == n) {
           System.out.println("Found " + n);
           break;
       }
       if(n <= prime.data){

           if(prime.left == null){
               System.out.println(n+" Not found");
               break;
           }

           prime = prime.left;

       }
       if(n > prime.data){

           if(prime.right == null){
               System.out.println(n+" Not found");
               break;
           }

           prime = prime.right;

       }


    }
    if(prime == null){
        System.out.println(n+" Not found");

    }

}

}
