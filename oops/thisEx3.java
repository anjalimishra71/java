class thisEx3{
    public static void main(String args[]){
     Test obj=new Test();
      obj.show();
      System.out.println(obj);
    }
}
class Test{
    void show(){
        this.disp();
        System.out.println("show()");
    }

    void disp(){
        System.out.println("disp..");
        dispObj(this);
    }
    void dispObj(Test temp){
        System.out.println(temp);
    }
}