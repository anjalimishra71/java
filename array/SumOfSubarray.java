
public class SumOfSubarray{

   public static void subarr(int numbers[]){
      int sum=0;
      int large=Integer.MIN_VALUE;
      for(int i=0;i<numbers.length;i++){
        for(int j=i;j<numbers.length;j++){
            sum=0;
            for(int k=i;k<=j;k++){
                sum+=numbers[k];
                
            
            }
            if(large<sum){
                    large=sum;
            }

            System.out.println(sum);
        }
           System.out.println();

      }
      System.out.println("largest number is= "+large );
   }

    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        subarr(numbers);
    }
}