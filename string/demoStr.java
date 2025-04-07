class demoStr{
    public static void main(String args[]){
        String s1="hello" ,s2;
        System.out.println("s1 "+s1);

        s2=s1;
        s1=s1+" students";
        System.out.println("s1: "+s1);
        System.out.println("s2: "+s2);
        

        A obj=new A();
        System.out.println("A is: "+obj);

    }
}

class A{
    String a="Hi i am a class object";
    public String toString(){
        return a;
    }
}