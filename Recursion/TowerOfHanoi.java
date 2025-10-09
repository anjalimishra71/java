
// public class TowerOfHanoi{
//     public static void tOH(int n, char A,char B,char C){
//         if(n==0){
//             return;
//         }
//         tOH(n-1,A,C,B);
//         System.out.println(A+" to "+C);
//         tOH(n-1,B,A,C);
//             }
//     public static void main(String args[]){
//         tOH(3,'A','B','C');
//     }
// }


public class TowerOfHanoi {

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        // Step 1: Move top n-1 disks from src to helper using dest
        towerOfHanoi(n - 1, src, dest, helper);

        // Step 2: Move nth (largest) disk from src to dest
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);

        // Step 3: Move n-1 disks from helper to dest using src
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {
        int n = 3;
        towerOfHanoi(n, "A", "B", "C");
    }
}
