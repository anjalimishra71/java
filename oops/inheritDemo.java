class inheritDemo{
  public static void main(String[] args){
   B obj=new B();
   System.out.println("main: "+obj.x);
  }

}

class A{
    int x=10;
    A(){
        System.out.println("parent "+this.x);
        System.out.println("parent "+this.show());
    }
    int show(){
           System.out.println("A ");

        return x;
    }
}

class B extends A{
    int x=20;
    B(){
        System.out.println("child: "+this.show());
    }
    int show(){
        System.out.println("B ");

        return x;
    }
}