import java.util.*;
public class MostFrequent{
    public static int mostFrequent(ArrayList<Integer> nums,int key){
        int result[]=new int[1000];
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==key){
                result[nums.get(i+1)-1]++;
            }
        }
        int ans=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<1000;i++){
            if(result[i]>max){
                max=result[i];
                ans=i+1;
            }
        }
        return ans;
    }

     public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
       int key=2;
        System.out.println(mostFrequent(list,key));
    }
}
