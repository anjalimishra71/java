class demoStr2{
    public static void main(String args[]){
        String s1="hello",s2,s3="hello";
        s2=s1;
        System.out.println(s1==s2);
        s1=s1+"student";
        System.out.println("s1==s2 "+ (s1==s2));
        System.out.println("s1==s3 "+ (s1==s3));
        System.out.println("s2==s3 "+ (s2==s3));
        System.out.println("s1:  "+ s1);
        System.out.println("s2: "+ s2);


    }
}