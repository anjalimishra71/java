public class BinaryToDec{

    public static void binaryToDec(int bin){
        int myNum=bin;
        int pow=0;
        int dec=0;
        while(bin>0){
            int lastDig=bin%10;
            
            dec=dec+(lastDig*(int)Math.pow(2,pow));
            bin=bin/10;
             pow++;
        }
        System.out.println("dec of "+myNum+"= "+dec);
    }
    public static void main(String args[]){
        binaryToDec(101);
    }
}