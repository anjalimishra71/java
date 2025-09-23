
public class Constructorr{
    public static void main(String args[]){
        // Student s1=new Student("Anjali",18);

        // System.out.println(s1.name);
        Student s2=new Student();
        s2.name="anju baba";
        s2.roll=21;
        s2.marks[0]=21;
        s2.marks[1]=99;
        s2.marks[2]=89;


        Student s3=new Student(s2);
        // System.out.println(s3.name);
        s2.marks[2]=110;
        for(int i=0;i<3;i++){
        System.out.println(s3.marks[i]);
      }
    }
}

class Student{
    String name;
    int roll;
    int marks[];

    //shallow copy
    Student(Student s2){
        marks=new int[3];
      this.name=s2.name;
      this.roll=s2.roll;
      this.marks=s2.marks;
    }

       //deep copy
    //  Student(Student s2){
    //   marks=new int[3];
    //   this.name=s2.name;
    //   this.roll=s2.roll;
    //   for(int i=0;i<marks.length;i++){
    //     this.marks[i]=s2.marks[i];
    //  }
      
    // }


    // Student(String name,int age){
    //     marks=new int[3];    
    // this.name=name;
    //     this.roll=roll;
    // }

    Student(){
            marks=new int[3];
    System.out.println("hello");
    }
}