import java.util.*;
class duck{
public static void main(String args[]){
int num;
Scanner sc=new Scanner(System.in);
System.out.print("enter number..");
num=sc.nextInt();
int pos=0,rem,f=0;
while(num>9){
rem=num%10;
pos++;
if(pos==1 && rem==0){
f=1;
break;
}
else{
f=0;
}
num=num/10;
}
if(num==0 || f==1){
System.out.println("number is not duck num..");
}
if(f==0){
System.out.println("number is duck num..");

}
}
}