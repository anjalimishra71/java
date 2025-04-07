class constructor1{
    public static void main(String[] args){
        Test obj=new Test();
       obj.sum();
       Test obj1=new Test(20,30);
       obj1.sum();
    }
}

class Test{
    int a,b;
    Test(){
        System.out.println("I am non parameterised");
    }
    Test(int x,int y){
        a=x;
        b=y;
    }
    void sum(){
        System.out.println("sum ="+(a+b));
    }
}