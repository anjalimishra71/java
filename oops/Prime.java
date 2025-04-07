import java.util.*;
class Prime{
public static void main(String args[]){
int num;
Scanner sc=new Scanner(System.in);
System.out.println("enter any no");
num=sc.nextInt();
int f=1,i;
for(i=2;i<=num/2;i++){
if(num%i==0){
f=0;
break;
}
}
if(f==1){
System.out.println("num is prime");
}
else{
System.out.println("num is not prime");

}
}
}