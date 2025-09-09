
public class LinearSearch{
    public static int linearSearch(int numbers[],int key){
     for(int i=0;i<numbers.length;i++){
        if(numbers[i]==key){
            return i;
        }
     }
     return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,4,7,9,10,11,18,33};
        int key=100;
        int ind=linearSearch(numbers,key);
        if(ind==-1){
            System.out.println("key not found");
        }else{
            System.out.println("key found at index: "+ind);
        }
    }
}