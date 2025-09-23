
public class InheritenceEx{
    public static void main(String args[]){
       Fish shark=new Fish();
       shark.eat();
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breats");
    }
}

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swim in water");
    }
}