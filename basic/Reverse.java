public class Reverse{
    public static void main(String args[]){
        int num=3412;
        // while(num>0){
        //   int rem=num%10;
        //    num=num/10;
        //    System.out.print(rem);
        // }
    
    ///second way
    int reverse=0;
    while(num>0){
        int rem=num%10;
           num=num/10;
          reverse=reverse*10+rem;
    }
    System.out.println(reverse);
    }
}