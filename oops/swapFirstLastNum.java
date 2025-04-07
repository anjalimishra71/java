import java.util.*;
class swapFirstLastNum{
public static void main(String args[]){
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your number");
num=sc.nextInt();
int firstDigit,lastDigit,middleDigit,temp,divisor=1;
lastDigit=num%10;
temp=num;
while(temp>=10){
temp/=10;
divisor*=10;
}
firstDigit=num/divisor;
middleDigit=(num%divisor)/10;
int total;
total=lastDigit*divisor+middleDigit*10+firstDigit;
System.out.println("number swaped="+total);
}

}