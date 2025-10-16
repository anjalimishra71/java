import java.util.ArrayList;

public class ArrayListOperations{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        //add operation
        list.add(1);//O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        
        list.add(2,77);
        System.out.println(list);
    
        //get operation
        // int element=list.get(2);
        // System.out.println(element);

        //delete
        // list.remove(2);
        // System.out.println(list);
 
        //set
        // list.set(2,10);
        // System.out.println(list);

       //contains
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));

    //    System.out.println(list.size());

       //print the arraylist
    //    for(int i=0;i<list.size();i++){
    //     System.out.print(list.get(i));
    //    }


    //reverse print
    for(int i=list.size()-1;i>=0;i--){
        System.out.print(list.get(i)+" ");
    }
   
   
    }
}