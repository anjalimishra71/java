import anjali.FirstPackage;
import java.util.*;
class UsePackage{
   public static void main(String[] args){
   int n;
   FirstPackage obj=new FirstPackage();
   System.out.println("Enter the no.");
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   if(obj.check_buzz(17))
    System.out.println("number is buzz number.....");

   else
     System.out.println("number is not buzz bumber");
    
    }
}



// import mypack.Simple;
// class Test
// {
//     public static void main(String[] arg)
//     {
//         Simple obj=new Simple();
//         obj.display();
//     }
// }