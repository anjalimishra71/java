class inherit2{
    public static void main(String[] args){
        Z obj =new Z(10);
    }
}
class X{
    X(){
        System.out.println("class x is created..");
    }
}

class Y extends X{
    Y(){
        System.out.println("class y is created..");
    }
}

class Z extends Y{
    Z(int a){
        System.out.println("class z is created..");
    }
}