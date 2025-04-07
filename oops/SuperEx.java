class SuperEx{
    public static void main(String args[]){
        B obj=new B();
        obj.show(10,20);
    }
}

class A{
   int a;
   A(int x){
    System.out.println("A()");
   }
   void show(int x,int y){
    System.out.println("Show() of A");
   }

}

class B extends A{
    int a;
    B(){
        super(10);
        System.out.println("B()");
    }
 void show(int x,int y){
    super.show(x,y);
    a=x;
    super.a=y;
    System.out.println("sum is="+(super.a+a));
 }

}
