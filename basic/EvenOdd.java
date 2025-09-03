import java.util.*;
public class EvenOdd{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int choice;
        int num;
        int evenSum=0;
        int oddSum=0;

        do{
        System.out.println("Enter the number");
        num=sc.nextInt();
           if(num%2==0){
                evenSum+=num;
            }else{
                oddSum+=num;
            }
            System.out.println("Do you want to continue? press 1 for yes or 0 for no");
            choice=sc.nextInt();
        }while(choice==1);
       
           
System.out.println("Sum of even numbers: "+evenSum);
System.out.println("Sum of odd numbers: "+oddSum);
    }
}