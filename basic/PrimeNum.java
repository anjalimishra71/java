public class PrimeNum{
      
    //   public static boolean PrimeNumber(int num){
    //     boolean isPrime=true;
    //     for(int i=2;i<=Math.sqrt(num);i++){
    //         if(num%i==0){
    //             return isPrime=false;
    //         }
    //     }
    //     return isPrime;
    //   }


    public static boolean PrimeNumber(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void PrimeInRange(int range){
        for(int i=1;i<=range;i++){
            if(PrimeNumber(i)){
                System.out.print(i+" ");
            }

        }
    }
    public static void main(String args[]){
    //  System.out.println(PrimeNumber(11));
      PrimeInRange(12);
    }
}