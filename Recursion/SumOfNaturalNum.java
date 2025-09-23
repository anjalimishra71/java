//space comp O(n)/time com O(n)
public class SumOfNaturalNum{
   public static int sumOfNum(int n){
       if(n==1){
        return 1;
       }
       return n+sumOfNum(n-1);
   }
    public static void main(String args[]){
        int n=5;
        System.out.print(sumOfNum(n));
    }
}