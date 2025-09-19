public class Diagonal{
    public static int diagonalSum(int matrix[][]){
       int diagSum=0;

    //bruit force //time com=O(n^2)

    //    for(int i=0;i<matrix.length;i++){
    //     for(int j=0;j<matrix[0].length;j++){
    //           if(i==j){
    //             diagSum+=matrix[i][j];
    //           }else if((i+j)==matrix.length-1){
    //             diagSum+=matrix[i][j];
    //           }
    //     }
    //    }

       //sec approach  ,time com=o(n) 
    for(int i=0;i<matrix.length;i++){
        diagSum+=matrix[i][i];
        if(i!=matrix.length-1-i){
             diagSum+=matrix[i][matrix.length-i-1];
        }
    }
       return diagSum;
    }

    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
       System.out.println(diagonalSum(matrix));
    }
}