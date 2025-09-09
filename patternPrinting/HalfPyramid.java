public class HalfPyramid{
    public static void main(String args[]){
       int n=4;
        int space=n-1;
       for(int i=1;i<=n;i++){
        // for(int j=space;j>=1;j--){
        //      System.out.print(" ");
       
        // }

        for(int j=1;j<=n-i;j++){
             System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
    //    space--;
      System.out.println();
       }
    }
}