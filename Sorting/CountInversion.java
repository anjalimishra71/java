
public class CountInversion{

   public static int mergeSort(int arr[],int left,int right){
       int invCount=0;
        if(right>left){
        int mid=(right+left)/2;
        invCount=mergeSort(arr,left,mid);//left part
        invCount+=mergeSort(arr,mid+1,right);//right part
        invCount+=merge(arr,left,mid+1,right);
        }
           return invCount;
    }   


    public static int merge(int arr[],int left,int mid,int right){
        int temp[]=new int[right-left+1];
        int i=left;
        int j=mid;
        int k=0;
        int invCount=0;
        while(i<mid && j<=right){
            if(arr[i]<=arr[j]){
                
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                invCount+=(mid-i);
                j++;
            }
            k++;
        }
       //left part
        while(i<mid){
            temp[k++]=arr[i++];
        }

        //right part
        while(j<=right){
            temp[k++]=arr[j++];
        }
        //copy temp to original arr
        for(i=left,k=0;i<=right;k++,i++){
            arr[i]=temp[k];
        }
        return invCount;
    }

    public static void main(String args[]){
        int arr[]={2,4,1,3,5};
        System.out.print(mergeSort(arr,0,arr.length-1));
    }
}