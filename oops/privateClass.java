class privateClass{    
String msg="private class is invoked";    
   
 private class Inner  
 {    
  void display()  
  {  
      System.out.println(msg);  
        
  }    
 }    
 public static void main(String args[]){    
     privateClass obj=new privateClass();    
     privateClass.Inner in=obj.new Inner();    
      in.display();    
 }    
}   