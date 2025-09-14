// import java.util.*;
import java.util.Arrays; //for assending order
import java.util.Collections;

public class InbuiltSort{
    public static void main(String args[]){
        // int arr[]={5,4,1,3,2};
        Integer arr[]={5,4,1,3,2};

        // Arrays.sort(arr);//assending order
        
        // Arrays.sort(arr,0,3);//swap at specific position

        // Arrays.sort(arr,Collections.reverseOrder());//reverse order is work on Integer object
         
        Arrays.sort(arr,0,4,Collections.reverseOrder());

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    

    }
}