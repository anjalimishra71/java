import java.util.*;
public class largestNum{
   public static void main(String args[]){
       int a[5],max,i;
        Scanner sc=new Scanner(System.in)
       System.out.println("enter five numbers...");
        
        for(i=0;i<5;i++){
        a[i]=sc.nextInt();
        }
       
for(i=0;i<5;i++){
max=a[0]
if(a[i]>max){
max=a[i];
}
}

System.out.println("largest number is ",max);
 }
}
}