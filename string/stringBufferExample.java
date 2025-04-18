class stringBufferExample{
    public static void main(String args[]){
         StringBuffer s1=new StringBuffer("Hello");
         StringBuffer s2=s1;
         System.out.println(s2);
         s1.append("students");
         System.out.println(s1);
         s1.insert(5,"java");
         System.out.println(s1);
         s1.replace(5,8,"jsp");
         System.out.println(s1);
         s1.reverse();
         System.out.println(s1);
         s1.append("servlet");
         System.out.println(s1);
         System.out.println(s1);
         s2.delete(3,6);   
         System.out.println(s1);
         System.out.println(s1.length()+" "+ s2.length());


    }
}