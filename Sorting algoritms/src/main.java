import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {



    public static void main(String[] args) {
        String[] arr = new String[7];
        //Remeber index 0-6
        arr[0] = "F";
        arr[1] = "B";
        arr[2] = "A";
        arr[3] = "D";
        arr[4] = "E";
        arr[5] = "G";
        arr[6] = "C";



        main n = new main();
       //n.BubbleSort(arr);
       // n.SelectionSort(arr);
        n.Divide(arr);



    }


    public void BubbleSort(String[] arr) {


        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].charAt(0) > arr[j + 1].charAt(0)) {
                    String one = arr[j];
                    String two = arr[j + 1];

                    arr[j] = two;
                    arr[j + 1] = one;
                }
            }
        }

    }

    public void SelectionSort(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            int Ipointer = i;
            int MovePoint = i;

            for (int j = i; j < arr.length; j++) {

                if (arr[j].charAt(0) < arr[MovePoint].charAt(0)) {

                    MovePoint = j;
                }


            }
            String Move = arr[MovePoint];
            String Ipoint = arr[Ipointer];

            arr[MovePoint] = Ipoint;
            arr[Ipointer] = Move;
        }
    }

    public void MergeSort(String[] arr){


    }

    public void Divide(String[] arr){


        while(arr.length !=1){
            int num = (int)(arr.length/2);
            String[]  a = Arrays.copyOfRange(arr, 0, num);
            String[]  b = Arrays.copyOfRange(arr, num, arr.length);
            Divide(a);
            Divide(b);
            System.out.println(Arrays.toString(a));
            System.out.println(Arrays.toString(b));
            Merge2(a,b,arr);
            return;

            //break;
        }

    }

    public void Merge2(String[] a, String[] b, String[] Stitch){

        int k = 0;
        int i = 0;
        int j = 0;

        while(i<a.length && j<b.length){
            if (a[i].charAt(0) < b[j].charAt(0)){
               Stitch[k] = a[i];
                System.out.println("Merge"+ Arrays.toString(Stitch));
               k++;
               i++;
            }else{
                Stitch[k] = b[j];
                System.out.println("Else Merge"+ Arrays.toString(Stitch));
                k++;
                j++;
            }
        }
        while(i<a.length){
            Stitch[k] = a[i];
            System.out.println(" a Merge"+ Arrays.toString(Stitch));
            k++;
            i++;
        }
        while(j<b.length){
            Stitch[k] = b[j];
            System.out.println(" b Merge"+ Arrays.toString(Stitch));
            k++;
            j++;
        }


    }


}
