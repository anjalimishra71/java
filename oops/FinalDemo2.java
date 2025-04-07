class FinalDemo2{
    public static void main(String[] args){
        B obj=new B();
        obj.show();
        obj.disp();
    }
}
  
class A{
    final void show(){
        System.out.println("Show() A");
    }

    void disp(){
        System.out.println("disp() A"); 
    }
}

class B extends A{
    void disp(){
        System.out.println("disp B");
    }
}