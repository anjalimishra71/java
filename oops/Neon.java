import java.util.*;
class Neon{
public static void main(String args[]){
int n,num;
Scanner sc=new Scanner(System.in);
System.out.println("enter any no");
num=sc.nextInt();
System.out.println("check"+num+" is neon num or not");
n=num*num;
int sum=0,rem;
while(n>0){
rem=n%10;
sum+=rem;
n=n/10;
}
if(sum==num){
System.out.println("num is neon");
}
else{
System.out.println("num is not neon");

}
}
}