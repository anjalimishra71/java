
public class ConvertNumToStr{
    public static void convertNumToStr(int num){
        String str[]={"zero", "one" ,"two", "three", "four","five","six", "seven", "eight","nine"};
        if(num==0){
             return;
        }
        int rem=num%10;
        num=num/10;
        convertNumToStr(num);
        System.out.print(str[rem]+" ");   

    }
    public static void main(String args[]){
        convertNumToStr(2019);
    }
}