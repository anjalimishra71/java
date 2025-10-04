
public class FriendsPairing{
    public static int friendsPairingProb(int n){
        if(n==1 || n==2){
            return n;
        }

        //singal
         int fnm1=friendsPairingProb(n-1);
        
        //pair
        int fnm2=friendsPairingProb(n-2);
        int pairWays=(n-1)*fnm2;

        //totWays
        int totWays=fnm1+pairWays;
        return totWays;  
    }
    public static void main(String args[]){
      System.out.print(friendsPairingProb(3));
    }
}