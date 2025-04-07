import anjali.*;
import anjali.mishra.*;
import java.util.*;
class UsePackage2{
    public static void main(String[] args){
        int n;
        FirstPackage obj1=new FirstPackage();
         SecondPackage obj2=new SecondPackage();
         System.out.println("Enter any number..");
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         if(obj1.check_buzz(n))
         System.out.println(n+ " is buzz number..");
        else
         System.out.println(n+ " is not a buzz number");

        System.out.println("Enter number of factorial");
        n=sc.nextInt();

        System.out.println(n + "factorial is= "+obj2.find_factorial(n));
    }
}