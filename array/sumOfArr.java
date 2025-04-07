import java.util.Scanner;

public class sumOfArr {
    public static void main(String args[]) {
        int a[] = new int[5], sum = 0;
        int a[]={1,1,1,1,1};
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            sum += a[i];
        }
        
        System.out.println("Sum of array elements = " + sum);
    }
}