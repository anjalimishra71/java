
public class NthFibonacci{
    public static int nthFino(int num){
        if(num==0 || num==1) return num;
        return nthFino(num-1)+nthFino(num-2); 
    }
    public static void main(String args[]){
        int num=4;
        System.out.print(nthFino(num));
    }
}