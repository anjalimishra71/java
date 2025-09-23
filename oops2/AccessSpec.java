
public class AccessSpec{
    public static void main(String args[]){
      BankAccount myAcc=new BankAccount();
       myAcc.username="anjali  mishra";
       // myAcc.password="123abcd";//we can't ass outside because pass is private
       myAcc.setPassword("123asc");
    }
}

class BankAccount{
     public String username;
     private String password;

     public void setPassword(String pwd){
        password=pwd;
     }
}