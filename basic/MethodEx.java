public class MethodEx{
    public static void PrintHello(){
        System.out.println("hello developers");
        System.out.println("keep it up");
    }
    
    public static int sum(int a,int b){
      int c=a+b;
      return c;
    }

    public static void swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a= "+a+" b= "+b);
    }


      public static int factorial(int n){
           int f=1;
           for(int i=n;i>=1;i--){
            f=f*i;
           }
           return f;
      }


public static int bioCoeff(int n,int r){
     int n_fact=factorial(n);
       int r_fact=factorial(r);
       int nr_fact=factorial(n-r);
      return n_fact/(r_fact*nr_fact);
}

    public static void main(String args[]){
       PrintHello();
       int a=10;
       int b=5;
        System.out.println(sum(a,b));
     
        swap(a,b);
        System.out.println("a= "+a+" b= "+b);//coz it,s call by value so change values only in method not actually change(in java only call by value)

        System.out.println(factorial(5));
       
       //bionomial coefficient nCr=n!/r!(n-r)!
          int n=5;
          int r=3;
       System.out.println(bioCoeff(n,r));
    }
}