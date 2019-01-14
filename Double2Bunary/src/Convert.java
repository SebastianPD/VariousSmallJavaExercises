public class Convert {

    public static void main(String[] args) {

        double x = .7211109;
        String Con = Long.toBinaryString(Double.doubleToLongBits(x));

       if(Con.length() > 32){
           System.out.println("error");
       }else {

           System.out.println(Con);
       }
        System.out.println(Con);


    }

}
