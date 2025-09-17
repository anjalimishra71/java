import java.util.*;
public class Strings{

    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        // char arr[]={'a', 'b', 'c' , 'd'};
        // String str="abcd";
        // String str2=new String("xyz@#$123");
        // System.out.println(str2);
        //String are immutable

        Scanner sc=new Scanner(System.in);
        String name;
        // name=sc.next();
        // name=sc.nextLine();
        // System.out.println(name);

            // String fullname="Tony kakar";
            // System.out.println(fullname.length());

            //concatenation
            String firstName="Anjali";
            String lastName="Mishra";
            String fullname=firstName+" "+lastName;
            printLetters(fullname);
    }
}