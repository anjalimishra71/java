
public class PracticeQ2{
    public static void main(String args[]){
      Vehicle obj1=new Car();
      obj1.print();

      Vehicle obj2=new Vehicle();
      obj2.print();

    }
}


class Vehicle{
    void print(){
            System.out.println("base class(vehicle)");
    }
}

class Car extends Vehicle{
    void print(){
        System.out.println("derived class(Car)");
    }
}