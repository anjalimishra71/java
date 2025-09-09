
public class LargestNumber{

     public static int largestNum(int num[]){
        int largest=Integer.MIN_VALUE;//-infinity
        for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                largest=num[i];
            }
        }
        return largest;
     }

    public static void main(String args[]){
        int num[]={1,2,5,2,99,5};
        int larNum=largestNum(num);
        System.out.println("Largest number is "+larNum);
    }
}