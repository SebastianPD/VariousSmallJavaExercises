import java.util.Arrays;

public class Main {

    public class randomArr{

        int data;
        int[] arr;


        public randomArr(int d){

            this.data = d;
            this.arr = new int[d];
        }

    }
    public randomArr A;
    public randomArr B;

    public static void main(String[] args) {
        //System.out.println("Hello World");
        Main M = new Main();
        M.create(30);
        M.createEmt(30);
        M.Hash(M.A.arr,M.B.arr);
    }

    public void create(int d){
        randomArr a1 = new randomArr(d);
        for (int i = 0; i < a1.arr.length; i++) {

            a1.arr[i] = (int)(99*Math.random()+1);
            System.out.println("index " + i + " value of "+ a1.arr[i]);
        }
        A = a1;

    }
    public void createEmt(int d){
        randomArr a2 = new randomArr(d);
        Arrays.fill(a2.arr, -1);
        B = a2;
    }
    public void Hash(int[] one, int[] two){

        for (int i = 0; i <one.length ; i++) {
            int mod = one[i]%(one.length-1);
            while(two[mod] != -1){
                //Collision
                mod = mod +1;
                if (mod == one.length){

                    mod = mod%one.length;

                }
            }
            two[mod] = one[i];
            System.out.println("New index "+ mod +" wirh value " + one[i]);
        }


    }

}
