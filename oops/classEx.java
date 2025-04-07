class Employee  
{  
    int id;  
    String name;  
    long salary;  
    public Employee(int id, String name, long salary) {  
      //  super();  
        this.id = id;  
        this.name = name;  
        this.salary = salary;  
    }  
  
}  
  
class classEx  
{  
  
    public static void main(String[] args) {  
          
        Employee e=new Employee(101,"John William",25000);  
  
    System.out.println(e.id+" "+e.name+" "+e.salary);  
      
          
    }  
}  