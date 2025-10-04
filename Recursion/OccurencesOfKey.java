
public class OccurencesOfKey{
    public static void occOfKey(int arr[],int ind,int key){
    if(ind==arr.length){
        return;
    }
    if(arr[ind]==key){
        System.out.print(ind+ " ");
    }
    occOfKey(arr,ind+1,key);

    }
    public static void main(String args[]){
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        occOfKey(arr,0,key);
    }
}