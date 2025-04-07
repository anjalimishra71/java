class abstractDemo{
  public static void main(String[] args){
    Circle c=new Circle();
    Rect r=new Rect();

    c.getSides(5,0);
    r.getSides(10,20);
    c.area();
    r.area();
  }

}

abstract class Shape{
   double s1,s2,a;
   final double PI=3.14;
   abstract void area();
   
   void getSides(double s1,double s2){
    this.s1=s1;
    this.s2=s2;
   }

   }

   void Circle extends Shape{
    void area(){
        a=PI*(s1*s2);
        System.out.println("Area of Circle="+a);
    }
   }

void Rect extends Shape{
    void area(){
        a=s1*s2;
        System.out.println("area of rectangle: "+a);
    }
}