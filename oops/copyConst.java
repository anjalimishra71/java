class copyConst{
    public static void main(String[] args){
    //   copyObj obj=new copyObj(10,20);
    //       obj.show();

    //       copyObj obj1=new copyObj(obj);
    //       obj1.show();

     copyObj obj=new copyObj(10,20);
     copyObj obj1=new copyObj(0,0);
          obj1=obj;
          obj1.show();
          obj.show();



}
}
class copyObj{
    int a,b;
    copyObj(int x,int y){
      a=x;
      b=y;
    }
    copyObj(copyObj temp){
        a=temp.a;
        b=temp.b;
    }
    void show(){
        System.out.println("value of a and b is= "+(a+b));
    }
}