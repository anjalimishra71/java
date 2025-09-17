public class FindIndOfRotatedArr{

    public static int indAtRotatedArr(int nums[],int target){
        int start=0;
        int lastEnd=nums.length-1;
         
         while(start<=lastEnd){
           int mid=(start+lastEnd)/2;
            if(target==nums[mid]){
                return mid;
            }

          //left half sorted
            if(nums[start]<=nums[mid]){
             if(target>=nums[start] && target < nums[mid]){
                 lastEnd=mid-1;
             }else{
                start=mid+1;
             }
            }

            //right half
            else{
                if(target>nums[mid] && target<=nums[lastEnd]){
                    start=mid+1;
                }else{
                    lastEnd=mid-1;
                }
            }
         }
         return -1;
    }

    public static void main(String args[]){
        int nums[]={4,5,6,7,0,1,2};
        int target=0;
       System.out.println(indAtRotatedArr(nums,target));
    }
}