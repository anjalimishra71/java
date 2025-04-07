import java.util.*;
class multiDimArr{
    public static void main(String args[]){
        int a[][]=new int[2][3], i,j;
    Scanner sc=new Scanner(System.in); 

        System.out.print("Enter six numbers");
 
       for(i=0;i<2;i++){ 
        for(j=0;j<3;j++){
          a[i][j]= sc.nextInt();
        }
       }

   for(i=0;i<2;i++){ 
     for(j=0;j<3;j++){
    System.out.print(a[i][j]+" ");
     }
    }

        
    }
}