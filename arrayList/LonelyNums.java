import java.util.*;
public class LonelyNums{

    // public static void lonelyNumber(ArrayList<Integer> nums,ArrayList<Integer> res){
    //    for(int i=0;i<nums.size();i++){
    //     int first=nums.get(i)+1;
    //     int second=nums.get(i)-1;
    //     boolean f=true;
    //     int count=0;
    //     for(int j=0;j<nums.size();j++){
    //         if(nums.get(i)==nums.get(j) ){
    //             count++;
    //             if(count>1){
    //             f=false;
    //             break;
    //             }
               
    //         }
    //         if(nums.get(j)==first || nums.get(j)==second){
    //             f=false;
    //             break;
    //         }

    //     }
    //     if(f==true){
    //         res.add(nums.get(i));
    //     }
    //    }
    // }




    public static ArrayList<Integer> lonelyNumber(ArrayList<Integer> nums){
         ArrayList<Integer> res=new ArrayList<>();
        Collections.sort(nums);
         for (int i = 0; i < nums.size(); i++) {
                if ((i==0 || nums.get(i) - nums.get(i-1)>1) && (i == nums.size()-1 || nums.get(i+1) - nums.get(i)>1)) {
                    res.add(nums.get(i));
                }
                
            }
            return res;
    }
    public static void main(String args[]){
        ArrayList<Integer> nums=new ArrayList<>();
       
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);
        
        System.out.print(lonelyNumber(nums));
        
    }

}
