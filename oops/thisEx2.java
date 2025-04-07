class thisEx2{
    public static void main(String[] args){
    Test obj=new Test();
    }
}
class Test{
    Test(int a,int b){
        System.out.println("two parameter..");
    }
    Test(int a){
        this(20,10);
        System.out.println("one parameter");
    }
    Test(){
        this(10);
        System.out.println("no parameter");
    }
}