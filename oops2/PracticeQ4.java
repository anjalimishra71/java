// Print the sum, difference and product of two complex numbers by creating a class named Complex with separate methods for each operation whose real and imaginary parts are entered by the user.

import java.util.*;

class Complex{
    int real;
    int imag;

    public Complex(int r,int i){
         real=r;
         imag=i;
    }

    public static Complex add(Complex a , Complex b){
      return new Complex((a.real+b.real),(a.imag+b.imag));
    }

    public static Complex diff(Complex a,Complex b){
        return new Complex((a.real-b.real),(a.imag-b.imag));
    }

    public static Complex product(Complex a,Complex b){
        return new Complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
    }


    public void printComplex(){
        if(real==0 && imag!=0){
            System.out.println(imag+"i");
        }

       else if(real!=0 && imag==0){
            System.out.println(imag+"i");
        }else{
            System.out.println(real+"+"+imag+"i");
        }
    }
}

public class PracticeQ4{
    public static void main(String args[]){
    //   Scanner sc=new Scanner(System.in);
    //  System.out.println("Enter two numbers");
    //   int num1=sc.nextInt();
    //   int num2=sc.nextInt();

      Complex c=new Complex(4,5);
      Complex d=new Complex(9,4);

      Complex e=Complex.add(c,d);
      Complex f=Complex.diff(c,d);
      Complex g=Complex.product(c,d);
      
     e.printComplex();
     f.printComplex();
     g.printComplex();
    }
}