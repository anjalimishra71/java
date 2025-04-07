class inheritance1{
    public static void main(String args[]){
     Marks m=new Marks();
     m.setData(1001,"anj");
     m.getData();
     m.setMarks(77,89,99,76,66);
     m.showMarks();
    }
}

class Student{
    String n;
    int roll;
    void setData(int r,String x){
        roll=r;
        n=x;
    }

    void getData(){
        System.out.println("Roll: " +roll+" Name "+n);
    }
}

class Marks extends Student{
    int m,e,s,so,h,t,p;
    void setMarks(int m,int e,int s,int so,int h){
        this.m=m;
        this.e=e;
        this.s=s;
        this.so=so;
        this.h=h;
     }
    void process(){
        t=m+s+e+h+so;
        p=t/5;
    }

    void showMarks(){
        process();
        System.out.println("Roll: "+roll +" name: "+n);
        System.out.println("Math: "+m +" english: "+e +" sci: "+s  +" social sci: "+so + " hindi: "+h );
        System.out.println("Total: "+t+"/500 percentage: "+p +"%");
    }
}