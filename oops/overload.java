class overload{
  public static void main(String[] args){
    Test obj=new Test();
System.out.println(obj.sum(30,40,50));
System.out.println(obj.sum(30,4));
System.out.println(obj.sum(30,40,50,10));
  }
}

class Test{
  int sum(int x,int y){
  return x+y;
}
int sum(int x,int y,int z){
return sum(x,y)+z;
}
int sum(int a,int b,int c,int d){
return sum(a,b,c)+d;
}

}