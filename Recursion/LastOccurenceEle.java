//first way
// public class LastOccurenceEle{
//     public static int lastOccurenceEle(int arr[],int key,int li){
//         if(li==-1){
//             return -1;
//         }
//         if(arr[li]==key){
//             return li;
//         }

//         return lastOccurenceEle(arr,key,li-1);
//     }
//     public static void main(String args[]){
//         int arr[]={8,3,6,9,5,10,2,5,3};
//         int key=5;
//         System.out.print(lastOccurenceEle(arr,key,arr.length-1));
//     }
// }

//second way
public class LastOccurenceEle{
    public static int lastOccurenceEle(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccurenceEle(arr,key,i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }

        return isFound;
    }
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,2,5,3};
        int key=5;
        System.out.print(lastOccurenceEle(arr,key,0));
    }
}