class override{
  public static void main(String[] args){
    Rectangle r=new Rectangle();
    r.getSides(10,20);
    r.area();

    Square s=new Square();
    s.getSides(10,20);
    s.area();

     Circle c=new Circle();
    c.getSides(10,20);
    c.area();
  }

}

class Shape{
    float PI=3.14f,a,s1,s2;
    void getSides(float x,float y){
        s1=x;
        s2=y;
    }
     void area(){
        a=s1*s2;
        System.out.println("Area is="+a);
    }
}

class Circle extends Shape{
   void area(){
    a=PI*s1*s1;
    System.out.println("Area is="+a);
  }
}
class Rectangle extends Shape{

}

class Square extends Shape{

}