

public class KadaneAlgo{
    public static void kadaneAlgo(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
                currSum+=numbers[i];
        if(currSum<0){
          currSum=0;
        }

        //ms=Math.max(currSum,maxSum);
            if(currSum>maxSum){
                maxSum=currSum;
            }
        }
        System.out.println("Max sum is: "+maxSum);
    }
    public static void main(String args[]){
        int numbers[]={-2,-3,-4,-1,-2,-1,-5,-3};
        kadaneAlgo(numbers);
    }
}