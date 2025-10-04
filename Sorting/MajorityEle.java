
// Given an array of integers nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times in the array.
// You may assume that the majority element always exists in the array.


// Brute Force Approach
// public class MajorityEle{
//     public static int majorityEle(int nums[]){
//       int n=nums.length/2;
//       int count=0;
//         for(int i=0;i<nums.length;i++){
//            count=0;
//             for(int j=0;j<nums.length;j++){
//               if(nums[i]==nums[j]){
//                 count++;
//               }
//             }
//             if(count>=n){
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int nums[]={2,2,1,1,1,2,2};
//         System.out.print(majorityEle(nums));
//     }
// }


// 2.Divide and Conquer
public class MajorityEle{
    public static int countInRange(int nums[],int num, int lo,int hi){
        int count=0;
        for(int i=lo;i<=hi;i++){
            if(nums[i]==num){
                count++;
            }
        }
        return count;
    }

    public static int majorityEle(int nums[],int lo,int hi){
        if(lo==hi){
           return nums[lo];  
        }

        int mid=(hi-lo)/2+lo;
        int left=majorityEle(nums,lo,mid);
        int right=majorityEle(nums,mid+1,hi);

        if(left==right){
            return left;
        }

        int leftCount=countInRange(nums,left,lo,hi);
         int rightCount=countInRange(nums,right,lo,hi);

         return leftCount>rightCount?left:right;
    }
   public static void main(String args[]){
        int nums[]={2,2,1,1,1,2,2};
        System.out.print(majorityEle(nums,0,nums.length-1));
    }
}