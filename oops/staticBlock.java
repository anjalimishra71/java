class staticBlock{
    public static void main(String args[]){
    Test obj=new Test();
    obj.show();
     Test obj1=new Test();
    obj1.show();
    }
}
class Test{
    static{
        System.out.println("A");
    }
    void show(){
        System.out.println("show");
    }
    static{
        System.out.println("B");
    }
}