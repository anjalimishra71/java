import java.util.*;

public class UpdateArr{

public static void update(int marks[],int nonChangeble){
    nonChangeble=10;
    for(int i=0;i<marks.length;i++){
        marks[i]+=1;
    }
}

    public static void main(String[] args){
        int marks[]={90,91,92};
        int nonChangeble=4;
        update(marks,nonChangeble);
        System.out.println(nonChangeble);//value not change coz it's pass by value
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");//value change coz it's pass by refernce
        }
        System.out.println();
    }
}