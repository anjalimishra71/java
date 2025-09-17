import java.util.*;

public class SpiralMatrix{
      
    public static void printSpiral(int matrix[][]){
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol=0;
        int endCol=matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
            //top
             for(int col=startCol;col<=endCol;col++){
                System.out.print(matrix[startRow][col]+" ");
             }
             startRow++;
            
            //right
             for(int row=startRow;row<=endRow;row++){
                System.out.print(matrix[row][endCol]+" ");
             }
             endCol--;

            //bottom
             for(int col=endCol;col>=startCol;col--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][col]+" ");
             }
             endRow--;
            //left
             for(int row=endRow;row>=startRow;row--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[row][startCol]+" ");
             }
             startCol++;
        }


    }

    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        printSpiral(matrix);


    }
}
