class overload2{
  public static void main(String[] args){
    Test obj=new Test();
System.out.println("Int="+obj.sum(30,4));
System.out.println("res="+obj.sum(30.2f,10.2));
System.out.println("double="+obj.sum(30.1d,40.1d));
System.out.println("res="+obj.sum(30.1f,4));
System.out.println("res="+obj.sum('A','B'));//autoBoxing concept

  }
}

class Test{
  int sum(int x,int y){
    System.out.println("integer is called");
  return x+y;
}

float sum(float x,float y){
  System.out.println("float is called");
return x+y;
}

double sum(double a,double b){
  System.out.println("double is called");
return a+b;
}

}