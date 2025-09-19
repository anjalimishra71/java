
public class EvenOdd{
    public static void evenOrOdd(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    public static void main(String args[]){
         evenOrOdd(3);
         evenOrOdd(12);
    }
}