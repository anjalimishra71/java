class staticMethod{
  public static void main(String args[]){
  int a,b;
  A obj=new A();
  obj.show();
  obj.disp();
  A.disp();
  A.show();
  }

}
class A{
    static int a,b;
    static void show(){
        a=10;
        b=20;
        System.out.println("show() "+(a+b));
    }
    static void disp(){
        show();
        System.out.println("static disp()");
    }
}