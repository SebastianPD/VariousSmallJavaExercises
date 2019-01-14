public class Main {

    public class node{
        int data;
        node branch1;
        node branch2;
        node branch3;

        public node(int data){
            this.data = data;

        }

    }

    public class q {
        node n;
        q next;

        public q(node n){
            this.n = n;
        }

    }

    node root;
    q first;
    q last;

    public static void main(String[] args) {
        Main m = new Main();
        m.add(1);
        m.add(2);
        m.add(4);
        m.add(5);
        m.add(3);
        m.add(6);
        m.add(9);
        m.add(10);
        System.out.println(m.root.branch2.branch1.data);


    }

    public void add(int data){
        node n = new node(data);


        if (root == null){
            root = n;

        } else {
            node Prime = root;
            while (Prime != null){
                if (Prime.branch1 == null) {
                    Prime.branch1 = n;

                    break;
                } else if (Prime.branch2 == null && Prime.branch1 != null) {
                    Prime.branch2 = n;

                    break;
                } else if (Prime.branch3 == null && Prime.branch2 != null) {
                    Prime.branch3 = n;
                    Qremove();
                    break;
                } else {

                    int value = Math.min(Prime.branch1.data, Prime.branch2.data);
                    int value2 = Math.min(Prime.branch3.data, value);

                    if (value2 == Prime.branch1.data) {
                            Qadd(Prime.branch1);
                            if (Prime.branch2.data < Prime.branch3.data){
                                Qadd(Prime.branch2);
                                Qadd(Prime.branch3);
                            } else {
                                Qadd(Prime.branch3);
                                Qadd(Prime.branch2);
                            }
                    } else if (value2 == Prime.branch2.data) {
                                Prime = Prime.branch2;
                        if (Prime.branch1.data < Prime.branch3.data){
                            Qadd(Prime.branch1);
                            Qadd(Prime.branch3);
                        } else {
                            Qadd(Prime.branch3);
                            Qadd(Prime.branch1);
                        }
                    } else {
                                Prime = Prime.branch3;
                        if (Prime.branch1.data < Prime.branch2.data){
                            Qadd(Prime.branch1);
                            Qadd(Prime.branch2);
                        } else {
                            Qadd(Prime.branch2);
                            Qadd(Prime.branch1);
                        }
                    }

                }
                Prime = first.n;


        }
        }

    }

    public void Qadd(node n){
        q x = new q(n);

        if(first == null){
            first = x;
            last = x;
        } else {
            last.next = x;
            last = x;

        }

    }
    public void Qremove(){

       if (first == null){

       } else {
           first = first.next;
       }


    }

}
