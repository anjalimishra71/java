
public class Diamond{
    public static void diamondPat(int n){
        // int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            // k+=2;
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            // k-=2;
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    public static void main(String args[]){
        diamondPat(4);
    }
}