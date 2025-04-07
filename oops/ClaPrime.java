class ClaPrime{
   public static void main(String[] args){
      int i,num,f=0;
        num=Integer.parseInt(args[0]);
        
      for(i=2;i<=num/2;i++){
           if(num%i==0){
             f=1;
           }
       }
      if(f==1){
       System.out.println("number is not prime number");
      }
      else{
              System.out.println("number is prime number");

     }

   }



}