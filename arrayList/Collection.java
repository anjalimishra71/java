import java.util.ArrayList;
import java.util.Collections;

public class Collection{
   
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(4);
        list.add(9);
        list.add(1);
       System.out.println(list);
       //ascending
       Collections.sort(list);
       System.out.println(list);
    
       //decending
       Collections.sort(list, Collections.reverseOrder());
               System.out.println(list);


    }
}
