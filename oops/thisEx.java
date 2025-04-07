class thisEx{
    public static void main(String args[]){
      Test obj=new Test();
      obj.set(10,20);
      System.out.println("product is="+obj.mult());

      Test obj1=new Test();
      obj1.set(10,3);
      System.out.println("product is="+obj1.mult());

    }
}

class Test{
    int a,b;
    void set(int a,int b){
        this.a=a;
        this.b=b;
    }
    int mult(){
        return a*b;
    }
}